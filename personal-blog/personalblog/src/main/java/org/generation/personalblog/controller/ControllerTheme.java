package org.generation.personalblog.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.generation.personalblog.model.Theme;
import org.generation.personalblog.repository.RepositoryTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/theme")
public class ControllerTheme {

	@Autowired
	private RepositoryTheme repository;

	@GetMapping("/all")
	public ResponseEntity<List<Theme>> getAll() {
		List<Theme> listObject = repository.findAll();
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

	@GetMapping("/{id_theme}")
	public ResponseEntity<Theme> findById(@PathVariable(value = "id_theme") Long idTheme) {
		Optional<Theme> themeObject = repository.findById(idTheme);
		if (themeObject.isPresent()) {
			return ResponseEntity.status(200).body(themeObject.get());
		} else {
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping("/{theme}")
	public ResponseEntity<List<Theme>> findByThemeI(@PathVariable(value = "theme") String theme) {
		List<Theme> listObject = repository.findAllByThemeContainingIgnoreCase(theme);
		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@GetMapping("/search")
	public ResponseEntity<List<Theme>> findByThemeII(@RequestParam(defaultValue = "") String theme) {
		List<Theme> listObject = repository.findAllByThemeContainingIgnoreCase(theme);
		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@PutMapping("/update")
	public ResponseEntity<Theme> update(@Valid @RequestBody Theme updateTheme) {
		return ResponseEntity.status(201).body(repository.save(updateTheme));
	}

	@DeleteMapping("/delete/{id_theme}")
	public void deleteThemeById(@PathVariable(value = "id_theme") Long idTheme) {
		repository.deleteById(idTheme);
	}

}
