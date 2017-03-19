package com.nandhi.myworks.HRInterface;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class EnterpriseHrInterfaceApplication {
	
	private static Logger log = Logger.getLogger(EnterpriseHrInterfaceApplication.class);

	public static void main(String[] args) {
		log.debug("Starting Spring Boot Application");
		SpringApplication.run(EnterpriseHrInterfaceApplication.class, args);
		log.debug("Application Successfully Started");
	}
}
