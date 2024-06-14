package com.nugraha.libraryweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import com.nugraha.libraryweb.entity.Book;
import com.nugraha.libraryweb.service.BookService;

@Controller
@RequestMapping("/books")

public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public String showBookList(Model model){
        List<Book> books = bookService.findAll();
        model.addAttribute("books", books);
        return "books";
    }

    @GetMapping("/add")
    public String showBookForm(Book book) {
        return "book-create";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model){
        Book book = bookService.findById(id);
        model.addAttribute("book", book);
        return "book-edit";
    }

    @PostMapping("/add")
    public String createBook(@RequestParam("title") String title, @RequestParam("author") String author, @RequestParam("isbn") String isbn){
        Book book = new Book(title, author, isbn);
        bookService.save(book);
        return "redirect:/books";
    }

    @PostMapping("/update/{id}")
    public String updateBook(@PathVariable("id") Long id, @RequestParam("title") String title, @RequestParam("author") String author, @RequestParam("isbn") String isbn){
        Book book = bookService.findById(id);
        book.setTitle(title);
        book.setAuthor(author);
        book.setIsbn(isbn);
        bookService.save(book);
        return "redirect:/books";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id){
        bookService.deleteById(id);
        return "redirect:/books";
    }
}
