package org.projectExample.repository;

import org.projectExample.entity.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookRepository {

    List<Book> books;

    public BookRepository() {
        this.books = new ArrayList<>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public void printBooks(){
        for (Book book : books){
            System.out.println(book);
        }
    }
}
