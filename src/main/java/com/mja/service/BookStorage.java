package com.mja.service;

import com.mja.model.Book;

import java.util.List;

public interface BookStorage {

    Book getBook(long id);

    List<Book> getAllBooks();

    void addBook(Book book);

}
