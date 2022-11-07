package team2mall.demo.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Builder
@Data
public class ProductRespDto {
    private int pdtId;
    private String pdtName;
    private int pdtPrice;
    private Map<String, List<Map<String, Object>>> pdtColors;
    private List<String> pdtImgs;
}
