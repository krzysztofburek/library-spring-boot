package com.burek.krzysztof.libraryspringboot.service;

import com.burek.krzysztof.libraryspringboot.domain.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>();

    public BookService() {
        books.add(new Book("Adam Mickiewicz", "Pan Tadeusz"));
        books.add(new Book("Henryk Sienkiewicz", "Krzyżacy"));
        books.add(new Book("Juliusz Słowacki", "Balladyna"));
    }

    public void addBook(String title, String author) {
        Book book = new Book(author, title);
        books.add(book);
    }

    public List<Book> getAll() {
        return books;
    }

    public Book getBookById(Long id) {
        return books.stream().filter(book -> book.getId() == id).findFirst().orElse(null);
    }

    public void deleteBookById(Long id) {
        books.removeIf(book -> book.getId() == id);
    }
}
