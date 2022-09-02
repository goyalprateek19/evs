package com.hdfc.emailverificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class EmailVerificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailVerificationServiceApplication.class, args);
	}

}
