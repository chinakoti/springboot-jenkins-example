package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootJenkinsExampleApplication {
	
	
	private static final Logger  logger = LoggerFactory.getLogger(SpringbootJenkinsExampleApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Spring boot Application initialized");

	}

	public static void main(String[] args) {
		logger.info("Spring boot Application executed");
		SpringApplication.run(SpringbootJenkinsExampleApplication.class, args);

	}

}
