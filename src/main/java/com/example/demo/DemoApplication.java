package com.example.demo;

import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	private static final Logger LOGGER =
			LoggerFactory.getLogger(DemoApplication.class);
	private static final Marker IMPORTANT =
			MarkerFactory.getMarker("IMPORTANT");

	public static void main(String[] args) {

		LOGGER.info("This is an INFO level log message!");
		LOGGER.error("This is an ERROR level log message!");

		MDC.put("user", "rafal.kuc@sematext.com");
		LOGGER.info("This is the first INFO level log message!");

		MDC.put("executionStep", "one");
		LOGGER.debug("This is the second INFO level log message!");

		MDC.put("executionStep", "two");
		LOGGER.error(IMPORTANT,"This is the third INFO level log message!");

	}

}
