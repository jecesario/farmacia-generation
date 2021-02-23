package com.jecesario.farmaciageneration.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.jecesario.farmaciageneration.models.Categorias;
import com.jecesario.farmaciageneration.repositories.CategoriasRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/categorias")
public class CategoriasController {

	@Autowired
	private CategoriasRepository repository;

	@GetMapping
	public ResponseEntity<List<Categorias>> list() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id")
	public ResponseEntity<Categorias> getById(@PathVariable long id) {
		return repository.findById(id).map(obj -> ResponseEntity.ok(obj)).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<Categorias> add(@RequestBody Categorias categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}

	@PutMapping("/atualizar/{categoria}")
	public ResponseEntity<Categorias> update(@RequestBody Categorias categoria) {
		return ResponseEntity.ok(repository.save(categoria));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
