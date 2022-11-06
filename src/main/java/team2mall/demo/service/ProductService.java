package team2mall.demo.service;

import team2mall.demo.dto.CollectionListRespDto;
import team2mall.demo.dto.ProductRespDto;

import java.util.List;

public interface ProductService {
    public List<CollectionListRespDto> getProductList(String category, int page) throws Exception;
    public ProductRespDto getProduct(int pdtId) throws Exception;
}
