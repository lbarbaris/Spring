package com.lbarbaris.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getInfoForAllEmps(){
        return "view";
    }

    @GetMapping("/hr_info")
    public String onlyForHR(){
        return "view_for_hr";
    }

    @GetMapping("/manager_info")
    public String getManager(){
        return "view_for_manager";
    }
}
