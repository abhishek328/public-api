package com.javatpoint.controller.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Component
public class BookDAO {
    @Autowired
    private BookRepository repository;
    public Collection<Book> getBooks()
    {
        return repository.findAll();
    }

    public Book createBook(Book book) {
        return repository.insert(book);
    }

    public Optional<Book> getBookById(String bookId) {
        return repository.findById(bookId);
    }

    public Optional<Book> deleteBookById(String bookId) {
        Optional<Book> book = repository.findById(bookId);
        book.ifPresent(b->repository.delete(b));
        return book;
    }

    public Optional<Book> updateBookById(String bookId, BookUpdatePayLoad bookUpdatePayLoad) {
        Optional<Book> book = repository.findById(bookId);
        book.ifPresent(b -> b.setName(bookUpdatePayLoad.getName()));
        book.ifPresent(b -> b.setAuthor(bookUpdatePayLoad.getAuthor()));
        book.ifPresent(b->repository.save(b));

        return book;
    }
    public Collection<Book> getAllTutorials( String title) {

            /*Collection<Book> books = new ArrayList<Book>();

            if (title == null)
                repository.findAll().forEach(books::add);
            else
                repository.findByTitleContaining(title).forEach(books::add);


            return  books;*/
     return repository.findByName(title);

    }
}
