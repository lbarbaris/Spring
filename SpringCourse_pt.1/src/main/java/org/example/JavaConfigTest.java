package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introduction.ConfigWithJavaCodeTest;
import spring_introduction.Person;

public class JavaConfigTest {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigWithJavaCodeTest.class);

        Person person = context.getBean("personBean", Person.class);
        person.callPet();
        System.out.println(person.getSurname());
    }
}
