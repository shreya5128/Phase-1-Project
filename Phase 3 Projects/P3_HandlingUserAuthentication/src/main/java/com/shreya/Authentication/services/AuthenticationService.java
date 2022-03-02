package com.shreya.Authentication.services;

import java.util.Optional;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shreya.Authentication.entities.User;
import com.shreya.Authentication.exceptions.UserNotFoundException;
import com.shreya.Authentication.repositories.AuthenticationRepository;
@Service

public class AuthenticationService {

	@Autowired
	Authentication RepositoryauthRepo;
	public User GetUserByName(String name, AuthenticationRepository authRepo) {
		Optional<User> found = authRepo.findUserByName(name);
		if(found.isPresent()) return found.get();
		else throw new UserNotFoundException();
	}

public Boolean isvalidPassword(String cmp, String actual) {
return ((cmp.equals(actual)) ?  true :  false);	
}

}
