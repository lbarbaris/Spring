package org.example;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Person;

public class AnnotationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        //Dog dog = context.getBean("myPet", Dog.class);
        //dog.Hello();
        Person person = context.getBean("personBean", Person.class);
        person.callPet();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
        context.close();
    }
}