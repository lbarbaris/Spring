package com.lbarbaris.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class NewController {

    @RequestMapping("/")
    public String firstView(){ return "first-view"; }

    @RequestMapping("/ask")
    public String ask(Model model){
/*        Employee emp = new Employee();
        emp.setName("Ivan");
        emp.setSurname("Yudintsev");
        emp.setSalary(2000);
        model.addAttribute("employee", emp);*/
        model.addAttribute("employee", new Employee());
        return "details-view";
    }

    @RequestMapping("/show")
    public String show(@Valid @ModelAttribute ("employee") Employee emp, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "details-view";
        }
        else{
            return "show-view";
        }
        //emp.setSurname(emp.getSurname() + "!");

    }
}
