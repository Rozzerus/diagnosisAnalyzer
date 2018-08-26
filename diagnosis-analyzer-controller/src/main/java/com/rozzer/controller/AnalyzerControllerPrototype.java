package com.rozzer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyzerControllerPrototype {

    @RequestMapping(value = "/analysis", method = RequestMethod.GET)
    public String analysis(){
        return "analysis successful";
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
