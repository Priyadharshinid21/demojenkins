package com.example.demojenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemojenkinsApplication {
public static Logger logger=LoggerFactory.getLogger(DemojenkinsApplication.class);

public void init()
{
	logger.info("Application started");
}
	public static void main(String[] args) {
		logger.info("Application executed");
		SpringApplication.run(DemojenkinsApplication.class, args);
	}

}
