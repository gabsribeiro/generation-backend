package org.generation.personalblog.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.generation.personalblog.model.User;
import org.generation.personalblog.repository.UserRepository;
import org.generation.personalblog.service.UserService;
import org.generation.personalblog.utility.UserDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserRepository repository;

	@Autowired
	UserService service;

	@PostMapping("/register")
	public ResponseEntity<Object> registerUser(@Valid @RequestBody User newUser) {
		Optional<Object> registeredObject = service.registerUser(newUser);
		if (registeredObject.isPresent()) {
			return ResponseEntity.status(201).body(registeredObject.get());
		} else {
			return ResponseEntity.status(401).build();
		}
	}

	@PutMapping("/auth")
	public ResponseEntity<Object> getCredentials(@Valid @RequestBody UserDTO loginPassword) {
		Optional<?> accreditedObject = service.getCredentials(loginPassword);
		if (accreditedObject.isPresent()) {
			return ResponseEntity.status(201).body(accreditedObject.get());
		} else {
			return ResponseEntity.status(401).build();
		}
	}

	@GetMapping("/all")
	public ResponseEntity<List<User>> findAll() {
		List<User> listObject = repository.findAll();

		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@GetMapping("/{id_user}")
	public ResponseEntity<User> findById(@PathVariable(value = "id_user") Long idUser) {
		Optional<User> userObject = repository.findById(idUser);

		if (userObject.isPresent()) {
			return ResponseEntity.status(200).body(userObject.get());
		} else {
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping("/name/{name}")
	public ResponseEntity<List<User>> findByName(@PathVariable(value = "name") String name) {
		List<User> listObject = repository.findAllByNameContainingIgnoreCase(name);

		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@PostMapping("/save")
	public ResponseEntity<User> save(@Valid @RequestBody User newUser) {
		return ResponseEntity.status(201).body(repository.save(newUser));
	}
	
	@PutMapping("/update")
	public ResponseEntity<Object> changeUser(@Valid @RequestBody UserDTO userChanges) {
		Optional<?> objectUpdate = service.changeUser(userChanges);

		if (objectUpdate.isPresent()) {
			return ResponseEntity.status(201).body(objectUpdate.get());
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id de usuario invalido!", null);
		}
	}

	@DeleteMapping("/delete/{id_user}")
	public ResponseEntity<Object> deleteUserById(@PathVariable(value = "id_user") Long idUser) {
		Optional<User> objectOptional = repository.findById(idUser);
		if (objectOptional.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id de usuario invalido!", null);
		} else {
			repository.deleteById(idUser);
			return ResponseEntity.status(200).build();
		}
	}

}
