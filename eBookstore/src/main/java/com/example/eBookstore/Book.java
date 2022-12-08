package com.example.eBookstore;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private String title;
    private String author;
    private String releaseDate;
    private String description;
    private String genre;
    private double price;
}
