package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsExampleApplicationTests {
	private static final Logger  logger = LoggerFactory.getLogger(SpringbootJenkinsExampleApplicationTests.class);

	@Test
	void contextLoads() {
		assertEquals("test","test");
	}

}
