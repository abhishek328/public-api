package com.javatpoint.controller.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    BookService bookService ;
    @GetMapping ("/books")
    public Collection<Book> getBooks()
    {
        return bookService.getBooks();
    }
    @PostMapping(path = "/books", consumes = "application/json ")
    public Book postBook(@RequestBody Book book)
    {
        return bookService.createBook(book);
    }
    @GetMapping ("books/{bookId}")
    public Optional<Book> getBookById (@PathVariable("bookId") String bookId )
    {
        return bookService.getBookById(bookId);
    }
    @DeleteMapping ("books/{bookId}")
    public Optional<Book> deleteBookById (@PathVariable String bookId )
    {
        return bookService.deleteBookById(bookId);
    }
    @PutMapping  ("books/{bookId}")
    public Optional<Book> updateBookById (@PathVariable String bookId ,
                                          @RequestBody BookUpdatePayLoad bookUpdatePayLoad)
    {
        return bookService.updateBookById(bookId,bookUpdatePayLoad );
    }
    @GetMapping ("booksbyname/{title}")
    public Collection<Book> getAllTutorials( @PathVariable String title)
    {
        return bookService.getAllTutorials( title);
    }



}
