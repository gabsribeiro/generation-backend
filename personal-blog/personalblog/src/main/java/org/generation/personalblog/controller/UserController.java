package org.generation.personalblog.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.generation.personalblog.model.UserModel;
import org.generation.personalblog.repository.UserRepository;
import org.generation.personalblog.service.UserService;
import org.generation.personalblog.utility.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("/api/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserRepository repository;

	@Autowired
	UserService service;

	@PostMapping("/register")
	public ResponseEntity<Object> registerUser(@Valid @RequestBody UserModel newUser) {
		Optional<Object> registeredObject = service.registerUser(newUser);
		if (registeredObject.isPresent()) {
			return ResponseEntity.status(201).body(registeredObject.get());
		} else {
			return ResponseEntity.status(400).build();
		}
	}

	@PutMapping("/auth")
	public ResponseEntity<Object> getCredentials(@Valid @RequestBody UserDTO loginPassword) {
		Optional<?> accreditedObject = service.getCredentials(loginPassword);
		if (accreditedObject.isPresent()) {
			return ResponseEntity.status(201).body(accreditedObject.get());
		} else {
			return ResponseEntity.status(400).build();
		}
	}

	@GetMapping("/all")
	public ResponseEntity<List<UserModel>> findAll() {
		List<UserModel> listObject = repository.findAll();

		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@GetMapping("/{id_user}")
	public ResponseEntity<UserModel> findById(@PathVariable(value = "id_user") Long idUser) {
		Optional<UserModel> userObject = repository.findById(idUser);

		if (userObject.isPresent()) {
			return ResponseEntity.status(200).body(userObject.get());
		} else {
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping("/name/{name}")
	public ResponseEntity<List<UserModel>> findByName(@PathVariable(value = "name") String name) {
		List<UserModel> listObject = repository.findAllByNameContainingIgnoreCase(name);

		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@PostMapping("/save")
	public ResponseEntity<UserModel> save(@Valid @RequestBody UserModel newUser) {
		return ResponseEntity.status(201).body(repository.save(newUser));
	}

	@PutMapping("/update")
	public ResponseEntity<UserModel> update(@Valid @RequestBody UserModel userToUpdate) {
		return ResponseEntity.status(201).body(repository.save(userToUpdate));
	}

	@DeleteMapping("/delete/{id_user}")
	public void deleteUserById(@PathVariable(value = "id_user") Long idUser) {
		repository.deleteById(idUser);
	}

}
