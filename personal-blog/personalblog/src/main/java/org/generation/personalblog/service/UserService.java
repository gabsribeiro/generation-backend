package org.generation.personalblog.service;

import java.util.Optional;

import org.generation.personalblog.model.User;
import org.generation.personalblog.repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private RepositoryUser repository;

	public Optional<Object> registerUser(User newUser) {
		return repository.findByEmail(newUser.getEmail()).map(existingUser -> {
			return Optional.empty();
		}).orElseGet(() -> {
			return Optional.ofNullable(repository.save(newUser));
		});
	}
}
