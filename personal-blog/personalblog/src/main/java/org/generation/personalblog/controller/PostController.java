package org.generation.personalblog.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.generation.personalblog.model.PostModel;
import org.generation.personalblog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
@RequestMapping("/api/post")
@CrossOrigin("*")
public class PostController {

	@Autowired
	private PostRepository repository;

	@GetMapping("/all")
	public ResponseEntity<List<PostModel>> findAll() {
		List<PostModel> listObject = repository.findAll();

		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}
	
	@GetMapping("/page")
	public ResponseEntity<Page<PostModel>> findAll(Pageable pageable) {
		Page<PostModel> listObject = repository.findAll(pageable);

		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@GetMapping("/{id_post}")
	public ResponseEntity<PostModel> findById(@PathVariable(value = "id_post") Long idPost) {
		Optional<PostModel> postObject = repository.findById(idPost);

		if (postObject.isPresent()) {
			return ResponseEntity.status(200).body(postObject.get());
		} else {
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping("/title/{title}")
	public ResponseEntity<List<PostModel>> findByTitle(@PathVariable(value = "title") String title) {
		List<PostModel> listObject = repository.findAllByTitleContainingIgnoreCase(title);

		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@PostMapping("/save")
	public ResponseEntity<PostModel> save(@Valid @RequestBody PostModel newPost) {
		return ResponseEntity.status(201).body(repository.save(newPost));
	}

	@PutMapping("/update")
	public ResponseEntity<PostModel> update(@Valid @RequestBody PostModel postToUpdate) {
		return ResponseEntity.status(201).body(repository.save(postToUpdate));
	}

	@DeleteMapping("/delete/{id_post}")
	public void deletePostById(@PathVariable(value = "id_post") Long idPost) {
		repository.deleteById(idPost);
	}
}
