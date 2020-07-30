package com.example.demo.controller;

import com.example.demo.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Autowired
    private QueryService queryService;

    @GetMapping("/execute")
    public String helloWorld(){
        queryService.executeQuery();
        return "Hello World";
    }

}
