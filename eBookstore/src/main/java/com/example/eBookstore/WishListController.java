package com.example.eBookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WishListController {

    @Autowired
    private WishListService wishListService;

    @GetMapping("/wishlist")
    public String getWishList(Model model) {

        //ArrayList<WishList> wishlist = wishListService.getWishList();

        //model.addAttribute("wishlist",wishlist);
        return "wishListPage";
    }

    @PostMapping("addwish")
    public String addWishList(@RequestParam String bookTitle, String bookAuthor, Long bookId) {
        wishListService.createWishList(bookTitle, bookAuthor, bookId);
        return "redirect:/wishlist";
    }
}
