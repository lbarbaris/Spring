package com.lbarbaris.spring;

import com.lbarbaris.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    @Autowired
    private RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/SpringCourse_pt.6.1_war_exploded/api/employees";

    public List<Employee> showAllEmployees(){
        ResponseEntity<List<Employee>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Employee>>() {
        });
        return responseEntity.getBody();
    }

    public Employee getEmployee(int id){
        Employee employee = restTemplate.getForObject(URL + "/" + id, Employee.class);
        return employee;
    }

    public void saveEmployee(Employee employee){
        int id = employee.getId();

        if (id == 0){
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(URL, employee, String.class);
            System.out.println("new emp added");
            System.out.println(responseEntity.getBody());
        }
        else{
            restTemplate.put(URL,employee);
            System.out.println("emp changed, id: " + id);
        }
    }

    public void deleteEmployee(int id){
        restTemplate.delete(URL + "/" + id);
        System.out.println("emp deleted, id: " + id);
    }
}
