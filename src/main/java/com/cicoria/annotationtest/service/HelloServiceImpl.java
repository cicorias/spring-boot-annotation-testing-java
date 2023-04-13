package com.cicoria.annotationtest.service;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(@NotNull String name) {
        return "Hello " + name;
    }


    
}
