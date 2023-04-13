package com.cicoria.annotationtest.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnExpression("${health.enabled}")
public class HealthServiceImpl implements HealthService {
    @Override
    public String getHealth() {
        return "OK";
       
    }
}
