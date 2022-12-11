package com.example.eBookstore;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface BookshelfRepository extends JpaRepository<Book, Long> {
    @Override
    ArrayList<Book> findAll();
    ArrayList<Book> findByTitle(String title);

    @Override
    void deleteById(Long aLong);
}
