package team2mall.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team2mall.demo.dto.admin.ProductMstOptionRespDto;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OptionProductMst {
    private int pdt_id;
    private String category;
    private String pdt_name;

    public ProductMstOptionRespDto toDto() {
        return ProductMstOptionRespDto.builder()
                .pdtId(pdt_id)
                .category(category)
                .pdtName(pdt_name)
                .build();
    }
}
