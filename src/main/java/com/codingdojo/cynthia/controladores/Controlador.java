package com.codingdojo.cynthia.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingdojo.cynthia.modelos.Chiste;
import com.codingdojo.cynthia.servicios.Servicios;

@Controller
public class Controlador {
	
	@Autowired
	private Servicios servicio;
	
	@GetMapping("/")
	public String index(Model model) {
		
		List<Chiste> listaChistes = servicio.muestraChistes("blanco");
		
		model.addAttribute("chistes", listaChistes);
		
		return "index.jsp";
	}
	
}
