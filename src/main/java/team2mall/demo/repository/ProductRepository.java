package team2mall.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import team2mall.demo.domain.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProductRepository {
    public List<CollectionsProduct> getProductList(Map<String, Object> map) throws Exception;
    public Product getProduct(int pdtId) throws Exception;

}


