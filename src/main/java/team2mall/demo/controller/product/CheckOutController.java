package team2mall.demo.controller.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CheckOutController {

    @GetMapping("/checkout")
    public String checkOut () {
        return "checkout";
    }
}
