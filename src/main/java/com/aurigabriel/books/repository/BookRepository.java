package com.aurigabriel.books.repository;

import com.aurigabriel.books.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
