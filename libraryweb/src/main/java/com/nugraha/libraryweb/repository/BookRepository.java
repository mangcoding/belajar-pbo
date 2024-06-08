package com.nugraha.libraryweb.repository;

import com.nugraha.libraryweb.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
