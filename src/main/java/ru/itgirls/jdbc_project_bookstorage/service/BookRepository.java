package ru.itgirls.jdbc_project_bookstorage.service;

import ru.itgirls.jdbc_project_bookstorage.entity.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
    Book findBookById(Long id);
}
