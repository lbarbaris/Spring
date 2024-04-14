package aop.ascpects;

import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
@Component // Component - аннотация чтобы создать bean
@Aspect
@Order(1)// Aspect - та часть кода, которую Spring воспроизводит вне бизнес логики. Попросту говоря, это сквозная логика приложения
public class LoggingAspect {
        //@Before ("execution(public * get*())")
        //@Before ("execution(* *())")
        //@Before ("execution(* getBook())")
        //@Before ("execution(public void get*())")
        //@Before ("execution(public void aop.Library.getBook())")
        @Before("execution(public void getBook())") //Pointcut - выражение, описывающее где должен быть применён Advice. В данном случае это execution
        public void beforeGetBookAdvice(){
            System.out.println("beforeGetBookAdvice: тест");
        }


        @Before("execution(public void *(*))") //для любых методов с одним параметром и любым названием
        public void beforeGetBookAdvice2(){
        System.out.println("beforeGetBookAdvice2: тест");
        }

        @Before("execution(public void *(..))") //для методов с любым количеством параметров и любым названием
        public void beforeGetBookAdvice3(){
        System.out.println("beforeGetBookAdvice3: тест");
        }

        @Before("execution(public void getBook(aop.Book))") //метода с параметром в виде объекта класса надо писать полное название класса
        public void beforeGetBookAdvice4(){
                System.out.println("beforeGetBookAdvice4: тест");
        }

}
