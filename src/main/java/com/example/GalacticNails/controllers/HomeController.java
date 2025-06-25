package com.example.GalacticNails.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/*
 created by Madeline Lora
 */
@Controller
@ResponseBody
@RequestMapping
public class HomeController {


    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye, spring";
    }


    @RequestMapping( value="hello", method= RequestMethod.POST)
    public String helloPost(@RequestParam String name, @RequestParam String language){
        if (name == null) {
            name = "World";
        }
        return createMessage(name, language);
    }

    public static String createMessage(String n, String l) {
        String greeting = "";

        if (l.equals("english")){
            greeting = "hello";
        } else if (l.equals("french")) {
            greeting = "Bonjour";
        } else if (l.equals("italian")) {
            greeting = "Bonjourno";
        } else if (l.equals("spanish")){
            greeting = "Hola";
        } else if (l.equals("Portuguese")){
            greeting = "Ola";
        }
        return greeting + " " + n;
    }

    @GetMapping("hello/form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action = '/hello' method = 'post'>" + // submit a request to /hello
                "<input type='text' name='name'>" +
                "<select name='language' id='language'>" +
                "<option value='english'>English</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='french'>French</option>" +
                "<option value='italian'>Italian</option>" +
                "<option value='portuguese'>Portuguese</option>" +
                "<input type='submit' value='Greetings!'>" +
                "</select>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
