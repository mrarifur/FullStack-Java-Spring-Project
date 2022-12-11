package com.example.eBookstore;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface WishListRepository extends JpaRepository<WishList, Long> {
    @Override
    ArrayList<WishList> findAll();

}
