package org.example;

import aop.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PointcutCombineTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniversityLibrary library = context.getBean("universityLibrary", UniversityLibrary.class);
        UniversityLibrary library1 = context.getBean("universityLibrary", UniversityLibrary.class);
        library.getBook();
        library1.getBook();

        library1.returnMagazine();

        library1.addBook();
        context.close();



    }
}
