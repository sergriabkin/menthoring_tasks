package com.company.java8.task5;

import com.company.java8.Task;
import com.company.java8.task5.domain.Book;
import com.company.java8.task5.repository.BookRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task5 implements Task {

    @Override
    public void performTask() {
        Book[] books = BookRepository.getInstance().getBooks();
        System.out.println("Task 5:");
        System.out.println("3.1. check if some/all book(s) have more than 200 pages: " + subTask31(books));
        System.out.println("3.2. find the books with max and min number of pages: ");
        subTask32(books);
        System.out.println("3.3. filter books with only single author: ");
        System.out.println(subTask33(books));
        System.out.println("3.4. sort the books by number of pages/title: ");
        System.out.println("3.5. get list of all titles: ");
        System.out.println("3.6. print them using forEach method: ");
        System.out.println("3.7. get distinct list of all authors: ");

        System.out.println("7. Use the Optional type for determining the title of the biggest book of some author: ");
    }

    private boolean subTask31(Book[] books) {
        return Stream.of(books)
                .anyMatch(book -> book.getNumberOfPages() > 200);
    }

    private void subTask32(Book[] books) {
        System.out.println("min: ");
        Stream.of(books)
                .min(Comparator.comparingInt(Book::getNumberOfPages))
                .ifPresent(System.out::println);
        System.out.println("max: ");
        Stream.of(books)
                .max(Comparator.comparingInt(Book::getNumberOfPages))
                .ifPresent(System.out::println);
    }

    private List<Book> subTask33(Book[] books) {
        return Stream.of(books)
                .filter(book -> book.getAuthors().size() == 1)
                .collect(Collectors.toList());
    }


}
