package team2mall.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    private int id;
    private String pdt_name;
    private int category_id;
    private int pdt_price;
    private List<ProductDetail> pdt_dtls;
    private List<ProductImg> pdt_imgs;
}
