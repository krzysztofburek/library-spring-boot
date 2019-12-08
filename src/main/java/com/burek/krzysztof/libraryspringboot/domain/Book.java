package com.burek.krzysztof.libraryspringboot.domain;

public class Book {

    private static long index = 0;
    private final long id;
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        id = index++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }
}
