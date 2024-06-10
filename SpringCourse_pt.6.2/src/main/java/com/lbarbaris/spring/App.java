package com.lbarbaris.spring;

import com.lbarbaris.spring.conf.MyConfig;
import com.lbarbaris.spring.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);



        Employee employee = communication.getEmployee(9);

        communication.deleteEmployee(employee.getId());
        List<Employee> allEmployees = communication.showAllEmployees();
        System.out.println(allEmployees);
    }
}
