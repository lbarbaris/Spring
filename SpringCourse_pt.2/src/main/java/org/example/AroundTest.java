package org.example;

import aop.FactoryLibrary;
import aop.MyConfig;
import aop.Student;
import aop.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AroundTest {
    public static void main(String args[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        FactoryLibrary library = context.getBean("factoryLibrary", FactoryLibrary.class);
        String bookName = library.returnBook();
        System.out.println("Вернули книгу " + bookName);
        context.close();
    }
}
