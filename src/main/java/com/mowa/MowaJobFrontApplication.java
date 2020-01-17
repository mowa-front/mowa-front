package com.mowa;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = PageHelperAutoConfiguration.class)
public class MowaJobFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(MowaJobFrontApplication.class, args);
	}

}
