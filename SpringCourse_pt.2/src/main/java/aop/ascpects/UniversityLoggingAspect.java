package aop.ascpects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class UniversityLoggingAspect {


    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение" +
                "списка студентов перед методом getStudents()");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
        Student firstStudent = students.get(0);

        firstStudent.setNameSurname("Mr " + firstStudent.getNameSurname());
        firstStudent.setAvgGrade(firstStudent.getAvgGrade() - 0.5);
        firstStudent.setCourse(firstStudent.getCourse() + 1);
        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение" +
                "списка студентов после метода getStudents()");
    }

    @AfterThrowing(pointcut = "execution(* throwing())", throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
        System.out.println("afterThrowingGetStudentsAdivce: логируем выброс " + exception);
    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное окончание работы или выброс исключения");
    }

}
