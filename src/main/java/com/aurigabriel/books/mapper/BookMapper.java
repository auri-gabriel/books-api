package com.aurigabriel.books.mapper;

import com.aurigabriel.books.dto.BookDTO;
import com.aurigabriel.books.model.Book;

public class BookMapper {

    public static Book toEntity(BookDTO dto) {
        return new Book(dto.getTitle(), dto.getAuthor(), dto.getPublishedYear());
    }

    public static BookDTO toDTO(Book entity) {
        return new BookDTO(entity.getTitle(), entity.getAuthor(), entity.getPublishedYear());
    }
}