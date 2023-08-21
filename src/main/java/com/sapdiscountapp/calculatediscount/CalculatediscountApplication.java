package com.sapdiscountapp.calculatediscount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = "com.sapdiscountapp.calculatediscount.*")
@ComponentScan(basePackages = "com.sapdiscountapp.calculatediscount.*")
@EnableAutoConfiguration
public class CalculatediscountApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatediscountApplication.class, args);
	}

}
