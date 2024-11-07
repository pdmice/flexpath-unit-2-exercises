package org.example;

import org.example.Models.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import java.util.Arrays;
import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookControllerTests {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetEndpoint() {
        var response = restTemplate.getForObject("/books", Book[].class);
        var books = new Book[] {
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 1925),
            new Book(2, "To Kill a Mockingbird", "Harper Lee", 1960),
            new Book(3, "The Catcher in the Rye", "J.D. Salinger", 1951),
            new Book(4, "Beloved", "Toni Morrison", 1987),
            new Book(5, "The Color Purple", "Alice Walker", 1982)
        };
        var sortedResponse = Arrays.asList(response).stream().sorted(Comparator.comparingInt(Book::getId)).toList();
        assertArrayEquals(books, sortedResponse.toArray());
    }

    @Test
    public void testGetByIdEndpoint() {
        var response = restTemplate.getForObject("/books/1", Book.class);
        var book = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        assertEquals(book, response);
    }

    @Test
    public void testPostEndpoint() {
        var book = new Book(6, "The Lord of the Rings", "J.R.R. Tolkien", 1954);

        var headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        var entity = new HttpEntity<>(book, headers);

        restTemplate.postForEntity("/books", entity, Book.class);
        var response = restTemplate.getForObject("/books/6", Book.class);
        assertEquals(book, response);

        // delete it
        restTemplate.delete("/books/6");
    }

    @Test
    public void testPutEndpoint() {
        // Perform the request and verify the response
        var book = new Book(1, "The Great Gasby", "F. Scott Fitzgerald", 1825);
        var headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");

        var entity = new HttpEntity<>(book, headers);
        restTemplate.put("/books/1", entity);

        var response = restTemplate.getForObject("/books/1", Book.class);
        assertEquals(book, response);

        // put it back
        book = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        entity = new HttpEntity<>(book, headers);
        restTemplate.put("/books/1", entity);
    }

    @Test
    public void testDeleteEndpoint() {
        // Perform the request and verify the response
        restTemplate.delete("/books/1");

        var response = restTemplate.getForObject("/books", Book[].class);
        var books = new Book[] {
                new Book(2, "To Kill a Mockingbird", "Harper Lee", 1960),
                new Book(3, "The Catcher in the Rye", "J.D. Salinger", 1951),
                new Book(4, "Beloved", "Toni Morrison", 1987),
                new Book(5, "The Color Purple", "Alice Walker", 1982)
        };
        assertArrayEquals(books, response);

        // put it back
        var book = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        var headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");

        var entity = new HttpEntity<>(book, headers);

        restTemplate.postForEntity("/books", entity, String.class);
    }
}