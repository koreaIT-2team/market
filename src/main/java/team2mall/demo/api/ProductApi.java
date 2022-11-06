package team2mall.demo.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team2mall.demo.dto.CMRespDto;
import team2mall.demo.service.ProductService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductApi {

    private final ProductService productService;

    @GetMapping("/collections/{category}")
    public ResponseEntity<?> getCollections(@PathVariable String category, int page) throws Exception {

        return ResponseEntity.ok(new CMRespDto<>("Successfully", productService.getProductList(category, page)));
    }
}
