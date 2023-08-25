package com.codingdojo.cynthia.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.cynthia.modelos.Chiste;
import com.codingdojo.cynthia.repositorios.RepositorioChistes;

@Service
public class Servicios {
	
	@Autowired
	private RepositorioChistes repoChiste;
	
	public List<Chiste> muestraChistes(String tipo) {
		return repoChiste.findByTipo(tipo);
	}
	
}
