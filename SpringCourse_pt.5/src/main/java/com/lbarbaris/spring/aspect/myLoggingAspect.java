package com.lbarbaris.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class myLoggingAspect {

    @Around("execution(* com.lbarbaris.spring.dao.*.*(..))")
    public Object aroundAllMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();

        System.out.println("Begin of " + methodName);

        Object targetResult = proceedingJoinPoint.proceed();

        System.out.println("End of " + methodName);
        return targetResult;
    }
}
