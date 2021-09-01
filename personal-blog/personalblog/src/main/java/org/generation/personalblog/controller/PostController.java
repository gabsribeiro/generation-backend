package org.generation.personalblog.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.generation.personalblog.model.Post;
import org.generation.personalblog.repository.PostRepository;
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
@RequestMapping("post")
@CrossOrigin("*")
public class PostController {

	@Autowired
	private PostRepository repository;

	@GetMapping("/all")
	public ResponseEntity<List<Post>> findAll() {
		List<Post> listObject = repository.findAll();

		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@GetMapping("/{id_post}")
	public ResponseEntity<Post> findById(@PathVariable(value = "id_post") Long idPost) {
		Optional<Post> postObject = repository.findById(idPost);

		if (postObject.isPresent()) {
			return ResponseEntity.status(200).body(postObject.get());
		} else {
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping("/title/{title}")
	public ResponseEntity<List<Post>> findByTitle(@PathVariable(value = "title") String title) {
		List<Post> listObject = repository.findAllByTitleContainingIgnoreCase(title);

		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@PostMapping("/save")
	public ResponseEntity<Post> save(@Valid @RequestBody Post newPost) {
		return ResponseEntity.status(201).body(repository.save(newPost));
	}

	@PutMapping("/update")
	public ResponseEntity<Post> update(@Valid @RequestBody Post postToUpdate) {
		return ResponseEntity.status(201).body(repository.save(postToUpdate));
	}

	@DeleteMapping("/delete/{id_post}")
	public void deletePostById(@PathVariable(value = "id_post") Long idPost) {
		repository.deleteById(idPost);
	}
}
