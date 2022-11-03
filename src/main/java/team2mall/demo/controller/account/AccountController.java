package team2mall.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/lakickz/login")
    public String login() {
        return "account/login";
    }

    @GetMapping("/lakickz/register")
    public String register() {
        return "account/register";
    }
}
