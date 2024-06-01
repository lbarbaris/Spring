package com.lbarbaris.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/Hello")
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }


    @RequestMapping("/ask")
    public String askForDetails(){
        return "details-view";
    }



/*    @RequestMapping("/show")
    public String showDetails(HttpServletRequest request, Model model){
        String name = request.getParameter("Name");
        name = "Mr. " + name;
        model.addAttribute("nameAttribute", name);
        return "show-view";
    }*/

    @RequestMapping("/show")
    public String showDetails(@RequestParam ("Name") String name, Model model) {
        name = "Ms. " + name;
        model.addAttribute("nameAttribute", name);
        return "show-view";
    }
}
