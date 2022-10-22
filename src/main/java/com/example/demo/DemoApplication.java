package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	private static final Logger LOGGER =
			LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {

		LOGGER.info("This is an INFO level log message!");
		LOGGER.error("This is an ERROR level log message!");
		//SpringApplication.run(DemoApplication.class, args);
	}

}
