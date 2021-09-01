package org.generation.personalblog.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.generation.personalblog.model.User;
import org.generation.personalblog.repository.UserRepository;
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
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserRepository repository;

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
	public ResponseEntity<User> update(@Valid @RequestBody User userToUpdate) {
		return ResponseEntity.status(201).body(repository.save(userToUpdate));
	}

	@DeleteMapping("/delete/{id_user}")
	public void deleteUserById(@PathVariable(value = "id_user") Long idUser) {
		repository.deleteById(idUser);
	}

}
