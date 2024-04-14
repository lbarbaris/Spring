package aop.ascpects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAdviceAspect {

    @Around("execution(public String returnBook())")
    public String aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long begin = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу");

        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
        }
        catch (Exception e){
            System.out.println("Поймали исключение " + e );
            result = "Неизвестное название книги";
            throw e;
        }
        long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку возвращают книгу");
        System.out.println("Время работы: " + (end - begin) + "миллисекунд");
        return (String) result;
    }


}
