package com.burek.krzysztof.libraryspringboot.controller;

import com.burek.krzysztof.libraryspringboot.service.BookService;
import com.burek.krzysztof.libraryspringboot.transport.BookTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DashboardController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/dashboard")
    public ResponseEntity getBooks() {
        return ResponseEntity.ok(bookService.getAll());
    }

    @GetMapping(value = "/dashboard/{id}")
    public ResponseEntity getBookById(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.getBookById(id));
    }

    @PostMapping(value = "/dashboard")
    public ResponseEntity addBook(@RequestBody BookTransport bookTransport) {
        bookService.addBook(bookTransport.getTitle(), bookTransport.getAuthor());
        return ResponseEntity.ok("Add book successfull");
    }

    @DeleteMapping(value = "/dashboard/{id}")
    public ResponseEntity deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
        return ResponseEntity.ok("Done");
    }

}
