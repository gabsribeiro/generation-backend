package org.generation.personalblog.controller;

import java.util.List;

import org.generation.personalblog.model.Post;
import org.generation.personalblog.repository.RepositoryPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
@CrossOrigin("*")
public class ControllerPost {

	@Autowired
	private RepositoryPost repository;

	@GetMapping
	public ResponseEntity<List<Post>> getAll() {
		List<Post> listObject = repository.findAll();

		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}
}
