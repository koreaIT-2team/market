package team2mall.demo.dto;

import lombok.Data;
import team2mall.demo.domain.Product;

import javax.validation.constraints.Min;

@Data
public class ProductRegisterReqDto {

    private int category;
    private String name;
    @Min(value = 100, message = "최소 가격은 100원입니다.")
    private int price;

    public Product toEntity() {
        return Product.builder()
                .category_id(category)
                .pdt_name(name)
                .pdt_price(price)
                .build();
    }
}
