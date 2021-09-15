package com.gabriela.gamestore.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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

import com.gabriela.gamestore.model.Category;
import com.gabriela.gamestore.repository.CategoryRepository;

@RestController
@RequestMapping("/api/category")
@CrossOrigin("*")
public class CategoryController {

	@Autowired
	private CategoryRepository repository;

	@GetMapping("/all")
	public ResponseEntity<List<Category>> getAll() {
		List<Category> listObject = repository.findAll();

		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@GetMapping("/{id_category}")
	public ResponseEntity<Category> findById(@PathVariable(value = "id_category") Long idCategory) {
		Optional<Category> categoryObject = repository.findById(idCategory);

		if (categoryObject.isPresent()) {
			return ResponseEntity.status(200).body(categoryObject.get());
		} else {
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping("/title/{title}")
	public ResponseEntity<List<Category>> findByTitleI(@PathVariable(value = "title") String console) {
		List<Category> listObject = repository.findAllByConsoleContainingIgnoreCase(console);

		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@PostMapping("/save")
	public ResponseEntity<Category> save(@Valid @RequestBody Category newCategory) {
		return ResponseEntity.status(201).body(repository.save(newCategory));
	}

	@PutMapping("/update")
	public ResponseEntity<Category> update(@Valid @RequestBody Category categoryToUpdate) {
		return ResponseEntity.status(201).body(repository.save(categoryToUpdate));
	}

	@DeleteMapping("/delete/{id_category}")
	public void deleteCategoryById(@PathVariable(value = "id_category") Long idCategory) {
		repository.deleteById(idCategory);
	}

}
