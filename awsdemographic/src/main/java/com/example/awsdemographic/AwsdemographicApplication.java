package com.example.awsdemographic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AwsdemographicApplication extends SpringBootServletInitializer{
	
	@Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(AwsdemographicApplication.class);
	    }

	public static void main(String[] args) {
		SpringApplication.run(AwsdemographicApplication.class, args);
	}

}
