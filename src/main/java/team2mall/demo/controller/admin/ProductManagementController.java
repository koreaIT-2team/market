package team2mall.demo.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductManagementController {

    @GetMapping("/admin/register")
    public String loadProductRegister() {

        return "admin/admin-register";
    }

    @GetMapping("/admin/register/dtl")
    public String loadProductDtlRegister() {
        return "admin/admin";
    }

    @GetMapping("/admin/product")
    public String loadProductList() {
        return "admin/product-list";
    }
}
