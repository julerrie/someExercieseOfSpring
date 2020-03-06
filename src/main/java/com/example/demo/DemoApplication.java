package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
//	
//	@Bean
//	public CommandLineRunner demo(PriceRepository repository) {
//		return (args) -> {
//		repository.save(new Price("A",795.00,145.31,0,20));
//		};
//	}

}
