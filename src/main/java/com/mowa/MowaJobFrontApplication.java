package com.mowa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MowaJobFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(MowaJobFrontApplication.class, args);
	}

}
