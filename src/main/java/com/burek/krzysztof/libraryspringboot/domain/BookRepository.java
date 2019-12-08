package com.burek.krzysztof.libraryspringboot.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
