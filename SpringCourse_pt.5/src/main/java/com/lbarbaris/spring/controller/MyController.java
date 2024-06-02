package com.lbarbaris.spring.controller;

import com.lbarbaris.spring.dao.EmployeeDAO;
import com.lbarbaris.spring.entity.Employee;
import com.lbarbaris.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;


    @RequestMapping("/")
    public String show(Model model){

        List<Employee> allEmpolyees = employeeService.getAllEmployees();
        System.out.println(allEmpolyees);
        model.addAttribute("allEmps", allEmpolyees);
        return "show";
    }

    @RequestMapping("/add")
    public String add(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "info";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute("employee") Employee employee){
        employeeService.save(employee);
        return "redirect:/";
    }

    @RequestMapping("/update")
    public String update(@RequestParam("empId") int id, Model model){
        Employee employee = employeeService.getEmp(id);
        model.addAttribute("employee", employee);

        return "info";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("empId") int id){
        employeeService.delete(id);
        return "redirect:/";
    }

}
