package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(){
        Student a = new Student("Vasya Vasiliev", 3, 3.5);
        Student b = new Student("Petya Petrov", 1, 5.0);
        Student c = new Student("Ivan Ivanov", 4, 3.89);
        Student d = new Student("Dmitriy Dmitrov", 5, 2.79);

        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);
    }


    public List<Student> getStudents(){
        System.out.println("Students:");
        System.out.println(students);
        return students;
    }

    public void throwing(){
        System.out.println(students.get(10));
    }
}
