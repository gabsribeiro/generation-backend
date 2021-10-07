package org.generation.personalblog.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.generation.personalblog.model.Theme;
import org.generation.personalblog.repository.ThemeRepository;
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
@RequestMapping("/api/theme")
@CrossOrigin("*")
public class ThemeController {

	@Autowired
	private ThemeRepository repository;
	
	@GetMapping("/all")
	public ResponseEntity<List<Theme>> findAll() {
		List<Theme> listObject = repository.findAll();

		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@GetMapping("/{id_theme}")
	public ResponseEntity<Theme> findById(@PathVariable(value = "id_theme") Long idTheme) {
		Optional<Theme> themeObject = repository.findById(idTheme);

		if (themeObject.isPresent()) {
			return ResponseEntity.status(200).body(themeObject.get());
		} else {
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping("/theme/{theme}")
	public ResponseEntity<List<Theme>> findByTheme(@PathVariable(value = "theme") String theme) {
		List<Theme> listObject = repository.findAllByThemeContainingIgnoreCase(theme);

		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@PostMapping("/save")
	public ResponseEntity<Theme> save(@Valid @RequestBody Theme newTheme) {
		return ResponseEntity.status(201).body(repository.save(newTheme));
	}

	@PutMapping("/update")
	public ResponseEntity<Theme> update(@Valid @RequestBody Theme themeToUpdate) {
		return ResponseEntity.status(201).body(repository.save(themeToUpdate));
	}

	@DeleteMapping("/delete/{id_theme}")
	public void deleteThemeById(@PathVariable(value = "id_theme") Long idTheme) {
		repository.deleteById(idTheme);
	}

}
