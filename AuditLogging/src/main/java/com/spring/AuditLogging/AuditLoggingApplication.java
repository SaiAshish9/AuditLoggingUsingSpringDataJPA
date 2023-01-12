package com.spring.AuditLogging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AuditLoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditLoggingApplication.class, args);
	}

}
