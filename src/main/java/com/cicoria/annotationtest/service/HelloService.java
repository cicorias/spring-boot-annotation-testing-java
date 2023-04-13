package com.cicoria.annotationtest.service;

import javax.validation.constraints.NotNull;

public interface HelloService {
    String sayHello(@NotNull String name);
}

