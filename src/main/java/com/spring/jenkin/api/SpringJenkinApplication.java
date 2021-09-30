package com.spring.jenkin.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinApplication {
	public static Logger logger= LoggerFactory.getLogger(SpringJenkinApplication.class);

	@PostConstruct
	static void init(){
		logger.info("Application executed ..."); //logger information
	}
	
	public static void main(String[] args) {
		logger.info("Application started ...");
		SpringApplication.run(SpringJenkinApplication.class, args);
	}

}
