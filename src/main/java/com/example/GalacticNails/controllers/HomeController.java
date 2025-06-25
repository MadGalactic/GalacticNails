package com.example.GalacticNails.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/*
 created by Madeline Lora
 */
@Controller
public class HomeController {

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye, spring";
    }

    // handles request of the form
    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value="hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!";
    }

    // handles requests of the form /hello/GalacticNails
    // this handler method is looking for requests to /hello/name where the name can be anything
    // will take the value of that piece of data and place it in the method parameter name
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name){
        return "Hello " + name + "<3";
    }

    @GetMapping("form")
    @ResponseBody
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + // submit a request to /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Hi'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
