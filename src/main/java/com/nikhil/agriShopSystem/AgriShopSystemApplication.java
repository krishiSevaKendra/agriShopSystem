package com.nikhil.agriShopSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class} )
public class AgriShopSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgriShopSystemApplication.class, args);
	}

}

