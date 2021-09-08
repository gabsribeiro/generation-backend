package org.generation.personalblog.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.generation.personalblog.model.ThemeModel;
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
@RequestMapping("/theme")
@CrossOrigin("*")
public class ThemeController {

	@Autowired
	private ThemeRepository repository;

	@GetMapping("/all")
	public ResponseEntity<List<ThemeModel>> findAll() {
		List<ThemeModel> listObject = repository.findAll();

		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@GetMapping("/{id_theme}")
	public ResponseEntity<ThemeModel> findById(@PathVariable(value = "id_theme") Long idTheme) {
		Optional<ThemeModel> themeObject = repository.findById(idTheme);

		if (themeObject.isPresent()) {
			return ResponseEntity.status(200).body(themeObject.get());
		} else {
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping("/theme/{theme}")
	public ResponseEntity<List<ThemeModel>> findByTheme(@PathVariable(value = "theme") String theme) {
		List<ThemeModel> listObject = repository.findAllByThemeContainingIgnoreCase(theme);

		if (listObject.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listObject);
		}
	}

	@PostMapping("/save")
	public ResponseEntity<ThemeModel> save(@Valid @RequestBody ThemeModel newTheme) {
		return ResponseEntity.status(201).body(repository.save(newTheme));
	}

	@PutMapping("/update")
	public ResponseEntity<ThemeModel> update(@Valid @RequestBody ThemeModel themeToUpdate) {
		return ResponseEntity.status(201).body(repository.save(themeToUpdate));
	}

	@DeleteMapping("/delete/{id_theme}")
	public void deleteThemeById(@PathVariable(value = "id_theme") Long idTheme) {
		repository.deleteById(idTheme);
	}

}
