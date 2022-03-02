package com.shreya.SpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.shreya.SpringSecurity.repositories.UsersRepository;
@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UsersRepository.class)

public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

}