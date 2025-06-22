package com.example.GalacticNails.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/*
 created by Madeline Lora
 */
@Controller
public class HomeController {

    @GetMapping
    @ResponseBody
    public String home() {
        return "Hello, Spring!";
    }

}
