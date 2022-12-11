package com.example.eBookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WishListService {

    @Autowired
    private WishListRepository wishListRepository;

    public void createWishList(String bookTitle, String bookAuthor, Long bookId) {

        WishList wishList = new WishList(bookTitle, bookAuthor, bookId);
        this.wishListRepository.save(wishList);
    }

    public ArrayList<WishList> getWishList() {
        return wishListRepository.findAll();
    }

    public void deleteWishListByBookId(Long bookId) {
        this.wishListRepository.deleteByBookId(bookId);
    }
}
