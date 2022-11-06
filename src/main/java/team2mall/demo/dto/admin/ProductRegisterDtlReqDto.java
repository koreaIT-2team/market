package team2mall.demo.dto.admin;

import lombok.Data;
import team2mall.demo.domain.ProductDetail;

@Data
public class ProductRegisterDtlReqDto {
    private int pdtId;
    private int pdtSize;
    private String pdtColor;
    private int pdtStock;

    public ProductDetail toEntity() {
        return ProductDetail.builder()
                .pdt_id(pdtId)
                .size_id(pdtSize)
                .pdt_color(pdtColor)
                .pdt_stock(pdtStock)
                .build();
    }
}
