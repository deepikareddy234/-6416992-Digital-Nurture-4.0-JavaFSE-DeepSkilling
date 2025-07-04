package com.library;

import com.library.service.BookService; // ✅ required import
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring config
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get BookService bean from Spring
        BookService bookService = context.getBean("bookService", BookService.class);

        // Call method
        bookService.addBook("Clean Code");
    }
}
