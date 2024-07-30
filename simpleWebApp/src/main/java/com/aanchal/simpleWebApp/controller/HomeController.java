package com.aanchal.simpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String greet() {
        return "Welcome Aanchal";
    }

    @RequestMapping("/about")
    @ResponseBody
    public String about() {
        return "I AM THE BEST!";
    }
}
