package org.generation.personalblog.service;

import java.util.Optional;

import org.generation.personalblog.model.UserModel;
import org.generation.personalblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public Optional<Object> registerUser(UserModel newUser){
		return repository.findByEmail(newUser.getEmail()).map(existingUser -> {
			return Optional.empty();
		}).orElseGet(() -> {
			return Optional.ofNullable(repository.save(newUser));
		});
	}
}
