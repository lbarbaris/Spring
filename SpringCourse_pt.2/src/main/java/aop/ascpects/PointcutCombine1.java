package aop.ascpects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class PointcutCombine1 {
   @Pointcut("execution(* aop.UniversityLibrary.get*())")
    private void allGetMethodsFromUniversityLibrary(){
    }

    @Pointcut("execution(* aop.UniversityLibrary.return*())")
    private void allReturnMethodsFromUniversityLibrary(){
    }

    @Pointcut("allGetMethodsFromUniversityLibrary() || allReturnMethodsFromUniversityLibrary()")
    private void allGetAndReturnMethodsFromUniversityLibrary(){
    }

    @Before("allGetMethodsFromUniversityLibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: writing Log#1");
    }

    @Before("allReturnMethodsFromUniversityLibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice: writing Log#2");
    }

    @Before("allGetAndReturnMethodsFromUniversityLibrary()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log#3");
    }
}
