package com.example.securitySpringboots;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class Controller {


    @GetMapping("/hello")
    public String retrunHello(){
        return "Hello World";
    }

    @GetMapping("/contact")
    public String retrunContact(){
        return "retrun Contact";
    }


    @GetMapping("/public/hello")
    public String retrunPublic(){
        return "retrun Public hello ";
    }
}
