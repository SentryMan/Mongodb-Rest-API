package com.collabera.mongodbtest.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.mongodbtest.Repository.JojoRepo;
import com.collabera.mongodbtest.model.Jojo;

@RestController
public class JojoController {

	@Autowired
	private final JojoRepo repo;

	public JojoController(JojoRepo repo) {
		super();
		this.repo = repo;
	}
	
	@GetMapping("/api/jojos")
	public List<Jojo> getAll() {
		
		return repo.findAll();
		
	}
	
	@PostMapping("/api/jojos")
	public ResponseEntity<Jojo> postCharacter(@RequestBody @Valid Jojo character) throws URISyntaxException {
		
		Jojo result = repo.insert(character);
		
		return ResponseEntity.created(new URI("/api/jojos/" + result.getId())).body(result);
	}
	
}
