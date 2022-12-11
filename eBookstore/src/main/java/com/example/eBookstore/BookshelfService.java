package com.example.eBookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
public class BookshelfService {

    @Autowired
    private BookshelfRepository bookshelfRepository;


    /*private ArrayList<Book> bookshelf;

    public BookshelfService() {
        this.bookshelf = new ArrayList<>();

        Book book1 = new Book("The Lord of the Rings", "J. R. R. Tolkien","1954-07-29","", "Fantasy", 20);
        Book book2 = new Book("Pride and Prejudice", "Jane Austen","1813-1-28","", "Novel", 15);
        Book book3 = new Book("Atomic Habits", "James Clear","2018-10-16","", "Self Help", 10);
        Book book4 = new Book("Holy Bible", "Various Authors","","", "Religion", 0);
        Book book5 = new Book("The Handmaid’s Tale", "Margaret Atwood","1985","", "Dystopian Novel", 20);
        Book book6 = new Book("The Shining", "Stephen King","1977-1-28","", "Horror", 20);
        Book book7 = new Book("The Three Musketeers", "Alexandre Dumas","1844","", "Historical Fiction", 20);
        Book book8 = new Book("And Then There Were None", "Agatha Christie","1939-11-6","", "Mystery", 20);
        Book book9 = new Book("Frankenstein", "Mary Shelley","1818","", "Sci Fi", 9.99);
        Book book10 = new Book("A Christmas Carol", "Charles Dickens","","", "Christmas", 1.99);

        this.bookshelf.add(book1);
        this.bookshelf.add(book2);
        this.bookshelf.add(book3);
        this.bookshelf.add(book4);
        this.bookshelf.add(book5);
        this.bookshelf.add(book6);
        this.bookshelf.add(book7);
        this.bookshelf.add(book8);
        this.bookshelf.add(book9);
        this.bookshelf.add(book10);
    }*/

    public ArrayList<Book> getBookshelf() {
        return this.bookshelfRepository.findAll();
    }

    public Book findBookByTitle(String bookTitle) {
        return this.bookshelfRepository.findByTitle(bookTitle).get(0);
    }

    public void addBook(String bookTitle, String bookAuthor, String bookReleaseDate, String bookGenre, double bookPrice, String bookDescription) {
        Book book = new Book(bookTitle, bookAuthor, bookReleaseDate, bookDescription, bookGenre, bookPrice);
        this.bookshelfRepository.save(book);
    }

    @Transactional
    public void deleteBookById(Long bookId) {
        this.bookshelfRepository.deleteById(bookId);
    }
}
