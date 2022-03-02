package com.shreya.SportyShoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SportyShoesApplication {
	public static void main(String[] args) {
		SpringApplication.run(SportyShoesApplication.class, args);
	}

}
