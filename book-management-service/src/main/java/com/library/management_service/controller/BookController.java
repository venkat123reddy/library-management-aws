package com.library.management_service.controller;


import com.library.management_service.models.Book;
import com.library.management_service.models.BookDTO;
import com.library.management_service.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/get")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @PostMapping("/create")
    public String createBook(@RequestBody BookDTO bookDTO) {

        Book book1 = bookRepository.save(getBookEntity(bookDTO));
        return book1.getBookId()+" Book Created Successfully";
    }

    @PutMapping("/update")
    public String updateBook(@RequestBody Book bookDTO) {
        Book book1 = bookRepository.save(bookDTO);
        return book1.getBookId()+" Book Created Successfully";
    }

    private Book getBookEntity(BookDTO bookDTO) {
        Book book = new Book();
        book.setBookAuthor(bookDTO.getBookAuthor());
        book.setBookName(bookDTO.getBookName());
        return book;
    }

    @DeleteMapping("/delete")
    public String deleteBook( @RequestBody BookDTO bookDTO) {
        bookRepository.delete(getBookEntity(bookDTO));
        return "";
    }

}
