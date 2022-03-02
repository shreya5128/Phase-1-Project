package com.shreya.PP.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.shreya.PP.entities.User;

@Repository

public abstract class UserRepository CrudRepository<User, Integer> {

	public abstract User findByName(String name);
	public Iterable<com.shreya.PP.entities.User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public com.shreya.PP.entities.User save(com.shreya.PP.entities.User userToUpdate) {
		// TODO Auto-generated method stub
		return null;
	}
	protected abstract Optional<User> findById(Integer id);
}
