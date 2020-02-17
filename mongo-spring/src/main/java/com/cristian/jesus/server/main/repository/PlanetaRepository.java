package com.cristian.jesus.server.main.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cristian.jesus.server.main.entity.Planeta;

public interface PlanetaRepository extends MongoRepository<Planeta, String>{
	
	Planeta findAllById(String id);
	
	List<Planeta> findAllByNome(String nome);
}
