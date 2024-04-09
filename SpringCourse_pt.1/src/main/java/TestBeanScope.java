import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Dog;
import spring_introduction.Person;

public class TestBeanScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog dog = context.getBean("dogSingletonScope", Dog.class);
        Dog dog2 = context.getBean("dogSingletonScope", Dog.class);
        //dog.Hello();
        System.out.println("переменные ссылаются на один объект?" + (dog == dog2));


        Dog dog3 = context.getBean("dogPrototypeScope", Dog.class);
        Dog dog4 = context.getBean("dogPrototypeScope", Dog.class);
        System.out.println("переменные ссылаются на один объект?" + (dog3 == dog4));
    }
}
