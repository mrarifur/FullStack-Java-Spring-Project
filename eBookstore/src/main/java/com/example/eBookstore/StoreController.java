package com.example.eBookstore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("*")
    public String redirectToIndex() {
        return "redirect:/";
    }
}
