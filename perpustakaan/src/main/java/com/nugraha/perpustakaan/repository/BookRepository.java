package com.nugraha.perpustakaan.repository;

import com.nugraha.perpustakaan.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}