package com.daas.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})//check on this later if it has any other impacts 
public class DaasServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaasServiceApplication.class, args);
	}
}
