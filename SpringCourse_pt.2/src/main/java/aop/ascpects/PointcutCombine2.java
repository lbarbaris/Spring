package aop.ascpects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class PointcutCombine2 {
    @Pointcut("execution(* aop.UniversityLibrary.*(..))")
    private void allMethodsFromUniversityLibrary(){
    }

    @Pointcut("execution(* aop.UniversityLibrary.returnMagazine())")
    private void ReturnMagazineFromUniversityLibrary(){
    }

    @Pointcut("allMethodsFromUniversityLibrary() && !ReturnMagazineFromUniversityLibrary()")
    private void AllWithoutReturnMagazineFromUnivertsityLibrary(){
    }

    @Before("AllWithoutReturnMagazineFromUnivertsityLibrary()")
    public void beforeAllWithoutReturnMagazine(){
        System.out.println("log #10");
    }
}
