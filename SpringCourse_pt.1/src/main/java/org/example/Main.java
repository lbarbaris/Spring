package org.example;
import spring_introduction.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Person;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Dog dog = context.getBean("myPet", Dog.class);
        //dog.Hello();
        Person person = context.getBean("myPerson", Person.class);
        person.callPet();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
        context.close();
    }
}