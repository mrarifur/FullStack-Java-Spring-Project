package com.example.eBookstore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Book extends AbstractPersistable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String author;
    private String releaseDate;
    private String description;
    private String genre;
    private double price;

    public Book(String title, String author, String releaseDate, String description, String genre, double price) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.description = description;
        this.genre = genre;
        this.price = price;
    }
}
