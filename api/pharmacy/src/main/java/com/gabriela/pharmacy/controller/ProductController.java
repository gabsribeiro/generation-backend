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

import com.gabriela.pharmacy.model.Product;
import com.gabriela.pharmacy.repository.ProductRepository;

@RestController
@RequestMapping("/api/product")
@CrossOrigin("*")
public class ProductController {

	@Autowired
	private ProductRepository repository;

	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAll() {
		List<Product> listObject = repository.findAll();
		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@GetMapping("/{id_product}")
	public ResponseEntity<Product> findById(@PathVariable(value = "id_product") Long idProduct) {
		Optional<Product> productObject = repository.findById(idProduct);
		if (productObject.isPresent()) {
			return ResponseEntity.status(200).body(productObject.get());
		} else {
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping("name/{name}")
	public ResponseEntity<List<Product>> findAllByName(@PathVariable(value = "name") String name) {
		List<Product> listObject = repository.findAllByNameContainingIgnoreCase(name);
		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}
	
	@PostMapping("/save")
	public ResponseEntity<Product> save(@Valid @RequestBody Product newProduct){
		return ResponseEntity.status(201).body(repository.save(newProduct));
	}
	
	@PutMapping("/update")
	public ResponseEntity<Product> update(@Valid @RequestBody Product productoUpdate){
		return ResponseEntity.status(201).body(repository.save(productoUpdate));
	}
	
	@DeleteMapping("/delete/{id_product}")
	public void deleteProductById(@PathVariable(value = "id_product") Long idProduct) {
		repository.deleteById(idProduct);
	}

}