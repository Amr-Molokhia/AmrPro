package com.X.AmrPro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class AmrProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmrProjectApplication.class, args);
	}

}
