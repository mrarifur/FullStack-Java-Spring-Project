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
public class WishList extends AbstractPersistable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "book_title")
    private String bookTitle;
    @Column(name = "book_author")
    private String bookAuthor;
    @Column(name = "book_id")
    private Long bookId;

    public WishList(Book book) {
        this.bookTitle = book.getTitle();
        this.bookAuthor = book.getAuthor();
        this.bookId = book.getId();
    }

    public WishList(String bookTitle, String bookAuthor, Long bookId) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
    }
}
