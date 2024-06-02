package com.lbarbaris.spring.service;

import com.lbarbaris.spring.dao.EmployeeDAO;
import com.lbarbaris.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void save(Employee employee){
        employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public Employee getEmp(int id){
        return employeeDAO.getEmp(id);
    }

    @Override
    @Transactional
    public void delete(int id){
        employeeDAO.delete(id);
    }

}
