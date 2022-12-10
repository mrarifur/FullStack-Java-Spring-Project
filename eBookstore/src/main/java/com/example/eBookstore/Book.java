package com.example.eBookstore;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@AllArgsConstructor
@Data
public class Book extends AbstractPersistable<Long> {
    private String title;
    private String author;
    private String releaseDate;
    private String description;
    private String genre;
    private double price;
}
