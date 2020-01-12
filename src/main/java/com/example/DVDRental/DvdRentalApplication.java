package com.example.DVDRental;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(value = "com.example")
@EntityScan(basePackages = {"com.example.DVDRental"})
@EnableJpaRepositories(basePackages = {"com.example.DVDRental"})
@SpringBootApplication
public class DvdRentalApplication {

	public static void main(String[] args) {

		SpringApplication.run(DvdRentalApplication.class, args);

	}
}
