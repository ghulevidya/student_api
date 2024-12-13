package edu.vidya.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("edu.vidya.spring")
public class PrebootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrebootcampApplication.class, args);
	}

}
