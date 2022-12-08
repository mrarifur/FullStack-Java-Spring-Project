package com.example.eBookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class BookshelfController {

    @Autowired
    private BookshelfService bookshelfService;

    @GetMapping("/bookshelf")
    public String getBookshelf(Model model) {
        ArrayList<Book> bookshelf = bookshelfService.getBookshelf();

        model.addAttribute("bookshelf", bookshelf);
        return "bookshelfPage";
    }
}
