package com.indracompany.lanchonete.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indracompany.lanchonete.model.Ingredientes;
import com.indracompany.lanchonete.service.IngredientesService;

@RestController
@RequestMapping({"/api"})
@CrossOrigin
public class IngredientesController {

	@Autowired
	private IngredientesService ingredientesService;

	@GetMapping("/ingredientes")
	public Iterable<Ingredientes> getListaIngredientes(){
		return ingredientesService.getListaIngredientes();
	}

}
