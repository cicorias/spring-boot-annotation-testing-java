package com.cicoria.annotationtest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cicoria.annotationtest.service.HealthService;
import com.cicoria.annotationtest.service.HelloService;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @Autowired(required = false)
    HealthService healthService;

    @GetMapping("/hello")
    public String sayHello() {
        var rv = helloService.sayHello("World");
        return rv;
    }


    @GetMapping("/health")
    public String getHealth() {
        if (healthService == null) {
            return "healthService is null";
        }
        
        var rv = healthService.getHealth();
        return rv;
    }
    
}
