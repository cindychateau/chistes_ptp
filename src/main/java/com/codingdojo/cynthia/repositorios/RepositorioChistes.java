package com.codingdojo.cynthia.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.cynthia.modelos.Chiste;

@Repository
public interface RepositorioChistes extends CrudRepository<Chiste, Long>  {
	
	List<Chiste> findAll(); //SELECT * FROM chistes
	
	List<Chiste> findByTipo(String tipo); //SELECT * FROM chistes WHERE tipo = "blanco"
	
}
