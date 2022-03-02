package com.shreya.Authentication;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.shreya.Authentication.controller.AuthenticationController;
import com.shreya.Authentication.entities.User;
import com.shreya.Authentication.exceptions.UserNotFoundException;
import com.shreya.Authentication.services.AuthenticationService;

@SpringBootApplication
@Import({
AuthenticationController.class,
UserNotFoundException.class,
AuthenticationService.class,
User.class
})

public class AuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationApplication.class, args);
		   }

}
