package org.example;

import aop.Book;
import aop.Library;
import aop.MyConfig;
import aop.SchoolLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LoggingTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Library library = context.getBean("library", Library.class);
        SchoolLibrary library1 = context.getBean("schoolLibrary", SchoolLibrary.class);
        library.getBook();
        Book book = context.getBean("book", Book.class);
        library1.getBook(book);
        context.close();



    }
}