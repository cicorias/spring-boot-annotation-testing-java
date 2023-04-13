package com.cicoria.annotationtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AnnotationtestApplication {

	public static void main(String[] args) {
		log.info("Starting AnnotationtestApplication");
		SpringApplication.run(AnnotationtestApplication.class, args);
		log.info("Started AnnotationtestApplication");
	}

}
