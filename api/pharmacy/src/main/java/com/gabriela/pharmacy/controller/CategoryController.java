package com.gabriela.pharmacy.controller;

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

import com.gabriela.pharmacy.model.Category;
import com.gabriela.pharmacy.repository.CategoryRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CategoryController {

	@Autowired
	public CategoryRepository repository;

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

	@GetMapping("category/{category}")
	public ResponseEntity<List<Category>> findAllByCategory(@PathVariable(value = "category") String category) {
		List<Category> listObject = repository.findAllByCategoryContainingIgnoreCase(category);
		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}
	
	@PostMapping("/save")
	public ResponseEntity<Category> save(@Valid @RequestBody Category newCategory){
		return ResponseEntity.status(201).body(repository.save(newCategory));
	}
	
	@PutMapping("/update")
	public ResponseEntity<Category> update(@Valid @RequestBody Category categorytoUpdate){
		return ResponseEntity.status(201).body(repository.save(categorytoUpdate));
	}
	
	@DeleteMapping("/delete/{id_category}")
	public void deleteProductById(@PathVariable(value = "id_category") Long idCategory) {
		repository.deleteById(idCategory);
	}
}
