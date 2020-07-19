package com.javatpoint.controller.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookDAO bookdao ;
    public Collection <Book> getBooks()
    {
      return bookdao.getBooks();
    }

    public Book createBook(Book book) {
        return bookdao.createBook( book);
    }

    public Optional<Book> getBookById(String bookId) {
        return bookdao. getBookById( bookId);
    }

    public Optional<Book> deleteBookById(String bookId) {
        return bookdao.deleteBookById( bookId);
    }

    public Optional<Book> updateBookById(String bookId, BookUpdatePayLoad bookUpdatePayLoad) {
        return bookdao.updateBookById( bookId, bookUpdatePayLoad);
    }
    public Collection<Book> getAllTutorials( String title)
    {
        return bookdao.getAllTutorials( title);
    }
}
