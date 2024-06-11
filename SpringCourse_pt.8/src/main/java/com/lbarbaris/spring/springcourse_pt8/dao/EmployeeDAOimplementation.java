package com.lbarbaris.spring.springcourse_pt8.dao;

import com.lbarbaris.spring.springcourse_pt8.entity.Employee;
import jakarta.persistence.EntityManager;

import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOimplementation implements EmployeeDAO{

    //SessionFactory (Hibernate) -> EntityManager (JPA)

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees(){
       /* Session session = entityManager.unwrap(Session.class);
        List<Employee> allEmployees = session.createQuery("from Employee", Employee.class).getResultList();*/

        Query query = entityManager.createQuery("from Employee", Employee.class);
        List<Employee> allEmployees = query.getResultList();
        return allEmployees;
    }

    @Override
    public void save(Employee employee){
/*        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(employee);*/

        Employee newEmp = entityManager.merge(employee);
        employee.setId(newEmp.getId());
    }

    @Override
    public Employee getEmp(int id) {
/*        Session session = entityManager.unwrap(Session.class);
        Employee employee = session.get(Employee.class, id);*/

        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public void delete(int id){
/*        Session session = entityManager.unwrap(Session.class);
        Employee employee = session.get(Employee.class, id);
        session.delete(employee);*/

        Query query = entityManager.createQuery("delete from Employee " + "where id=:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }


}
