package org.example;

import aop.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;



public class JoinpointTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        DistrictLibrary library1 = context.getBean("districtLibrary", DistrictLibrary.class);
        Book book = context.getBean("book", Book.class);
        library1.addBook("Misha", book);



    }
}
