package com.company.java8.task5.repository;

import com.company.java8.task5.domain.Author;
import com.company.java8.task5.domain.Book;

import java.util.List;

public class BookRepository {

    private Book[] books;

    private BookRepository(Book[] books) {
        this.books = books;
    }

    public static BookRepository getInstance() {
        Author author1 = new Author("Name1", (short) 30);
        Book book11 = new Book("Title11", 130);
        Book book12 = new Book("Title12", 140);
        Book book13 = new Book("Title13", 250);

        Author author2 = new Author("Name2", (short) 40);
        Book book21 = new Book("Title21", 350);
        Book book22 = new Book("Title22", 190);
        Book book23 = new Book("Title23", 300);

        Author author3 = new Author("Name3", (short) 35);
        Book book31 = new Book("Title31", 222);
        Book book32 = new Book("Title32", 155);
        Book book33 = new Book("Title33", 321);

        Book book41 = new Book("Title41", 333);
        Book book42 = new Book("Title42", 144);
        Book book43 = new Book("Title43", 388);


        book11.setAuthors(List.of(author1));
        book12.setAuthors(List.of(author1));
        book13.setAuthors(List.of(author1));
        book21.setAuthors(List.of(author2));
        book22.setAuthors(List.of(author2));
        book23.setAuthors(List.of(author2));
        book31.setAuthors(List.of(author3));
        book32.setAuthors(List.of(author3));
        book33.setAuthors(List.of(author3));

        book41.setAuthors(List.of(author1, author2));
        book42.setAuthors(List.of(author2, author3));
        book43.setAuthors(List.of(author3, author1));

        author1.setBooks(List.of(book11, book12, book13, book41));
        author2.setBooks(List.of(book21, book22, book23, book42));
        author3.setBooks(List.of(book31, book32, book33, book43));

        Book[] books = {
                book11, book12, book13,
                book21, book22, book23,
                book31, book32, book33,
                book41, book42, book43,
        };

        return new BookRepository(books);
    }


    public Book[] getBooks() {
        return books;
    }

}
