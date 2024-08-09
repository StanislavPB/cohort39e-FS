package org.projectExample;

import org.projectExample.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.projectExample");

        BookService service = (BookService) context.getBean("bookService");

        service.addNewBook("20 00 лье под водой", " Жуль Верн");
        service.addNewBook("Три мушкетера", "Дюма");
        service.addNewBook("   ", " Жуль Верн");
        service.addNewBook("Три товарища", "Ремарк");
        service.addNewBook("Три поросенка", " сказка ");

        service.printBooksData();

    }
}
