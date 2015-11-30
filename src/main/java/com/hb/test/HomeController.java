package com.hb.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String welcome(Model model) {
        System.out.println("FROM HOME CONTROLLER");
        model.addAttribute("greeting", "welcome");
        return "welcome";
    }
} 
