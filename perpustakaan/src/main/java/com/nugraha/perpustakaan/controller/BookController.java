package com.nugraha.perpustakaan.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nugraha.perpustakaan.entity.Book;
import com.nugraha.perpustakaan.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/dummy")
    public String dummy() {
        Book book = new Book(
            "Java Programming",
            "John Doe",
            "123-456-789"
        );
        bookService.save(book);

        return "Dummy book created";
    }

    @RequestMapping(value="/save", method=RequestMethod.GET)
    @ResponseBody
    public String save(@RequestParam String title, @RequestParam String author, @RequestParam String isbn) {
        Book book = new Book(title, author, isbn);
        bookService.save(book);
        return "Book created";
    }

    @RequestMapping(value="/store", method=RequestMethod.POST)
    @ResponseBody
    public String store(@RequestParam String title, @RequestParam String author, @RequestParam String isbn) {
        Book book = new Book(title, author, isbn);
        bookService.save(book);
        return "Book stored";
    }
}
