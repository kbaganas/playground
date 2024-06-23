package com.bk.playground;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PlaygroundApplication {

	private static final Logger logger = LogManager.getLogger(PlaygroundApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PlaygroundApplication.class, args);

		System.out.println("-------------------------------------------- Playground starts -------------------------------------------- ");

		logger.info("Info log");
		logger.error("Error log");
		logger.warn("Warning message");

		System.out.println("-------------------------------------------- Playground ended -------------------------------------------- ");

	}

}
