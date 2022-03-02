package com.shreya.Authentication.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.shreya.Authentication.entities.User;
import com.shreya.Authentication.services.AuthenticationService;
@Controller

public class AuthenticationController {
	
	Logger logger = LoggerFactory.getLogger(AuthenticationController.class);
	@Autowired
	AuthenticationService authService;
	@GetMapping("/")
	public String showGreeting() {
		return "greeting";
	}
	@GetMapping("/Auth")
	public String showLogin() {
		return "authenticate";
	}
	@PostMapping("/Auth")
	public String authenticateUser(@RequestParam("username") String username, @RequestParam("password") String pswd) {
		User user = authService.GetUserByName(username);
		logger.info(user.getName() + " attempted to login with " + user.getPassword());
	String path = (authService.isvalidPassword(pswd, user.getPassword())) ? "success" : "failure";
		logger.info("The path return: " + path);
		return path;
	}  

}
