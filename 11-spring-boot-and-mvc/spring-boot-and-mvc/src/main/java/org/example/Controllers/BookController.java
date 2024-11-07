package org.example.Controllers;
import org.example.Models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/books")
public class BookController {
    public List<Book> books = new ArrayList<>(List.of(
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 1925),
            new Book(2, "To Kill a Mockingbird", "Harper Lee", 1960),
            new Book(3, "The Catcher in the Rye", "J.D. Salinger", 1951),
            new Book(4, "Beloved", "Toni Morrison", 1987),
            new Book(5, "The Color Purple", "Alice Walker", 1982)
    ));

    public List<Book> getBooks() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Book getBookById(int id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void addBook(Book book) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void updateBook(int id, Book book) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void deleteBook(int id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
