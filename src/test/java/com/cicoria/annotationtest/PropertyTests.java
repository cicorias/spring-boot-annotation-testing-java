package com.cicoria.annotationtest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

import com.cicoria.annotationtest.service.HealthService;

import lombok.extern.slf4j.Slf4j;

// @Slf4j
@TestPropertySource(locations = {"classpath:proptest1.properties"})
// @TestPropertySource(locations = {"classpath:/resources/proptest1.properties"})
public class PropertyTests {

    @Nested
    @SpringBootTest
    // @TestPropertySource(properties = "health.enabled=true")
    // @TestPropertySource(locations = {"classpath:proptest1.properties"})
    public class TestConfig {
        @Autowired(required = false)
        HealthService myService;
    
        @Autowired
        Environment environment;
    
        @Test
        public void testMyServicePresence() {
            if (Boolean.parseBoolean(environment.getProperty("health.enabled"))) {
                assertNotNull(myService);
    
            } else {
                assertNull(myService);
            }

            // log.error("classpath:" + System.getProperty("java.class.path"));
        }
    }
}
