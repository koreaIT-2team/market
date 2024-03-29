package team2mall.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import team2mall.demo.domain.Product;
import team2mall.demo.dto.CollectionListRespDto;
import team2mall.demo.dto.ProductRespDto;
import team2mall.demo.exception.CustomValidationException;
import team2mall.demo.repository.ProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<CollectionListRespDto> getProductList(String category, int page) throws Exception {
        List<CollectionListRespDto> productList = new ArrayList<CollectionListRespDto>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("category", category);
        map.put("index", (page - 1) * 16);

        productRepository.getProductList(map).forEach(collectionsProduct -> {
            productList.add(collectionsProduct.toDto());
        });

        return productList;
    }
    @Override
    public ProductRespDto getProduct(int pdtId) throws Exception {
        Product product = productRepository.getProduct(pdtId);

        if(product == null) {
            Map<String, String> errormap = new HashMap<String, String>();
            errormap.put("error", "등록되지 않은 상품입니다.");
            throw new CustomValidationException("Get Product Error", errormap);
        }

        Map<String, List<Map<String, Object>>> pdtColors = new HashMap<String, List<Map<String, Object>>>();
        List<String> pdtImgs = new ArrayList<String>();

        product.getPdt_dtls().forEach(dtl -> {
            if(!pdtColors.containsKey(dtl.getPdt_color())){
                pdtColors.put(dtl.getPdt_color(), new ArrayList<Map<String, Object>>());
            }
        });

        product.getPdt_dtls().forEach(dtl -> {
            Map<String, Object> pdtDtlIdAndSize = new HashMap<String, Object>();
            pdtDtlIdAndSize.put("pdtDtlId", dtl.getId());
            pdtDtlIdAndSize.put("sizeId", dtl.getSize_id());
            pdtDtlIdAndSize.put("sizeName", dtl.getSize_name());
            pdtDtlIdAndSize.put("pdtStock", dtl.getPdt_stock());

            pdtColors.get(dtl.getPdt_color()).add(pdtDtlIdAndSize);
        });


        product.getPdt_imgs().forEach(img -> {
            pdtImgs.add(img.getSave_name());
        });

        ProductRespDto dto = ProductRespDto.builder()
                .pdtId(product.getId())
                .pdtName(product.getPdt_name())
                .pdtPrice(product.getPdt_price())
                .pdtColors(pdtColors)
                .pdtImgs(pdtImgs)
                .build();
        return dto;
    }

}
