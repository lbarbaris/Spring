package aop.ascpects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class JoinPointPointcuts {
    @Pointcut("execution (* add* (..))")
    private void allAddMethods(){};

    @Before("allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        //joinPoint - точка входа. позволяет получать данные о методе, к которому мы прикручиваем аспекты
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        /*System.out.println("methodSignature: " + methodSignature);
        System.out.println(methodSignature.getMethod());
        System.out.println(methodSignature.getReturnType());
        System.out.println(methodSignature.getName());*/

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj: arguments){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге. Название: "+ myBook.getName() + " автор: " + myBook.getAuthor() + " год выхода: " + myBook.getYearRelease());
                }
                else {
                    System.out.println("книгу в библиотеку добавляет "+ obj);
                }
            }
        }








        System.out.println("JoinPointPointcuts: log #1");
    }
}
