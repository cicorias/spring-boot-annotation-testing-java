package com.cicoria.annotationtest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
class AnnotationtestApplicationTests {

	@Test
	void contextLoads() {
	}

}
