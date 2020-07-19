package com.javatpoint.controller.book;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;
import java.util.List;

public interface BookRepository extends MongoRepository <Book , String> {
    Collection<Book> findByName(String title);
}
