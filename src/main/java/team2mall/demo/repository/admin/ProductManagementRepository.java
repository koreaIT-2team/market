package team2mall.demo.repository.admin;

import org.apache.ibatis.annotations.Mapper;
import team2mall.demo.domain.*;

import java.util.List;

@Mapper
public interface ProductManagementRepository {
    public List<ProductCategory> getCategoryList() throws Exception;
    public int saveProductMst(Product product) throws Exception;

    public List<OptionProductMst> getProductMstList() throws Exception;

    public List<OptionProductSize> getSizeList(int productId) throws Exception;

    public int findProductColor(ProductDetail productDetail) throws Exception;

    public int saveProductDtl(ProductDetail productDetail) throws Exception;

    public int saveProductImg(List<ProductImg> productImgs) throws Exception;
}
