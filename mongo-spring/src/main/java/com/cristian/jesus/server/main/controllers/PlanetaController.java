package com.cristian.jesus.server.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristian.jesus.server.main.entity.Planeta;
import com.cristian.jesus.server.main.repository.PlanetaRepository;

@RestController
@RequestMapping("/api")
public class PlanetaController {

	@Autowired
	private PlanetaRepository repositorio;
	
	@PostMapping(path = "/planetas")
	public ResponseEntity<Planeta> save(@RequestBody Planeta planeta ){
		Planeta e = repositorio.save(planeta);
		
		return ResponseEntity.ok().body(e);
	}
	
	@GetMapping(path = "/planetas")
	public ResponseEntity<List<Planeta>> findAll(){
		return ResponseEntity.ok().body(repositorio.findAll());
	}
	
	@GetMapping(path = "/planetas/buscarPorNome/{nome}")
	public ResponseEntity<List<Planeta>> findAllByNome(@PathVariable String nome ){
		return ResponseEntity.ok().body(repositorio.findAllByNome(nome));
	}
	
	@GetMapping(path = "/planetas/buscarPorId/{id}")
	public ResponseEntity<Planeta> findAllById(@PathVariable String id ){
		return ResponseEntity.ok().body(repositorio.findAllById(id));
	}
	
	@DeleteMapping(path = "/planetas/{id}")
	public void delete(@PathVariable String id) {
		repositorio.deleteById(id);
	}
}
