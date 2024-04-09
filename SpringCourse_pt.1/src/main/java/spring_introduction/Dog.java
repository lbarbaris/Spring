package spring_introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component ("dogBean")
public class Dog implements Pet {
    public Dog() {
 //       System.out.println("Dog is created");
    }

    public void Hello() {
        System.out.println("Dog says hello!");
    }

   /* @PostConstruct
    public void init() {
        System.out.println("init dog");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy dog");
    }*/
}