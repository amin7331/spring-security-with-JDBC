package amin7331.part7springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String homepage() {
        return "<h1>Welcome</h1>";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "<h1>welcome admin</h1>";
    }

    @GetMapping("/user")
    public String userPage() {
        return "<h1>welcome user<h1>";
    }
}
