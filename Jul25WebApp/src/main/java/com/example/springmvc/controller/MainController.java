package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    // Auto wired
    // Private studentDAD studentDAD

    @RequestMapping(value="home", method=RequestMethod.GET)
    public String printHelloWorld(ModelMap model){

        // Add attribute to model
        model.addAttribute("message",
                "Hello world and welcome to Spring MVC!");

        // Returning the name of the file to be loaded "home.jsp"
        return "home";
    }
}
