package com.spring.jenkin.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinApplicationTests {
	public static Logger logger= LoggerFactory.getLogger(SpringJenkinApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Application test ...");
		assertEquals(true,true);
	}

}
