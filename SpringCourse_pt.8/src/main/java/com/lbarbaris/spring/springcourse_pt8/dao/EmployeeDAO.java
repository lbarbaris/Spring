package com.lbarbaris.spring.springcourse_pt8.dao;

import com.lbarbaris.spring.springcourse_pt8.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void save(Employee employee);

    public Employee getEmp(int id);

    public void delete(int id);
}
