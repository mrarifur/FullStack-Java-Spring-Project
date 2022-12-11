package com.example.eBookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/bookshelf/{bookTitle}")
    public String getBookInfo (@PathVariable String bookTitle, Model model) {
        Book book = bookshelfService.findBookByTitle(bookTitle);
        model.addAttribute("book", book);
        return "bookPage";
    }

    @GetMapping("/add")
    public  String getAdd(Model model) {
        ArrayList<Book> bookshelf = bookshelfService.getBookshelf();

        model.addAttribute("bookshelf", bookshelf);
        return "addBookPage"; }

    @PostMapping("add")
    public String addBook(@RequestParam String bookTitle, String bookAuthor, String bookReleaseDate, String bookGenre, double bookPrice, String bookDescription ) {
        bookshelfService.addBook(bookTitle, bookAuthor, bookReleaseDate, bookGenre, bookPrice, bookDescription);
        return "redirect:/add";
    }

    @PostMapping("deletebook")
    public String deleteBook(@RequestParam Long bookId) {
        bookshelfService.deleteBookById(bookId);
        return "redirect:/add";
    }
}
