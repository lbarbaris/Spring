package org.example;

import aop.MyConfig;
import aop.Student;
import aop.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class UniversityTest {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.addStudent();
        List<Student> students = university.getStudents();
        System.out.println(students);
        try{
            university.throwing();
        }
        catch (Exception e){
            System.out.println("Поймали" + e);
        }
        context.close();
    }

}
