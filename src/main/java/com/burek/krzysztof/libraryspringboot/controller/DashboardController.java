package com.burek.krzysztof.libraryspringboot.controller;

import com.burek.krzysztof.libraryspringboot.domain.Book;
import com.burek.krzysztof.libraryspringboot.service.BookService;
import com.burek.krzysztof.libraryspringboot.transport.BookTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins={ "http://localhost:3000"})
@RestController
public class DashboardController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/dashboard", consumes = MediaType.APPLICATION_JSON_VALUE,  produces = "application/json")
    public ResponseEntity<List<Book>> getBooks() {
        return new ResponseEntity<>(bookService.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/dashboard/{id}")
    public ResponseEntity getBookById(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.getBookById(id));
    }

    @PostMapping(value = "/dashboard", consumes = MediaType.APPLICATION_JSON_VALUE,  produces = "application/json")
    public ResponseEntity addBook(@RequestBody BookTransport bookTransport) {
        bookService.addBook(bookTransport.getTitle(), bookTransport.getAuthor());
        return ResponseEntity.ok("success");
    }

    @DeleteMapping(value = "/dashboard/{id}")
    public ResponseEntity deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
        return ResponseEntity.ok("Done");
    }

}
