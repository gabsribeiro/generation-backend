package org.generation.personalblog.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.generation.personalblog.model.UserModel;
import org.generation.personalblog.repository.UserRepository;
import org.generation.personalblog.utility.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public Optional<Object> registerUser(UserModel newUser) {
		return repository.findByEmail(newUser.getEmail()).map(existingUser -> {
			return Optional.empty();
		}).orElseGet(() -> {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			String encryptedPassword = encoder.encode(newUser.getPassword());
			newUser.setPassword(encryptedPassword);
			return Optional.ofNullable(repository.save(newUser));
		});
	}

	public Optional<?> getCredentials(UserDTO authUser) {
		return repository.findByEmail(authUser.getEmail()).map(existingUser -> {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if (encoder.matches(authUser.getPassword(), existingUser.getPassword())) {
				String basicStructure = authUser.getEmail() + ":" + authUser.getPassword();
				byte[] authBase64 = Base64.encodeBase64(basicStructure.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(authBase64);
				authUser.setToken(authHeader);
				authUser.setId(existingUser.getIdUser());
				authUser.setName(existingUser.getName());
				authUser.setPassword(existingUser.getPassword());
				return Optional.ofNullable(authUser);
			} else {
				return Optional.empty();
			}
		}).orElseGet(() -> {
			return Optional.empty();
		});
	}
}
