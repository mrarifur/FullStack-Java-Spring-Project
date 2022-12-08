package com.example.eBookstore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class BookshelfController {

    @GetMapping("/bookshelf")
    public String getBookshelf(Model model) {
        ArrayList<String> bookshelf = new ArrayList<>();

        bookshelf.add("Book1");
        bookshelf.add("Book2");
        bookshelf.add("Book3");

        model.addAttribute("bookshelf");
        return "bookshelfPage";
    }
}
