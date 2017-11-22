package com.indracompany.lanchonete.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.indracompany.lanchonete.model.Ingredientes;

@Component
public class IngredientesService {

	private static List<Ingredientes> ingredientesList = new ArrayList<>();

	static {
		Ingredientes alface = new Ingredientes(1L, "Alface", 0,  new BigDecimal(0.40).setScale(2, BigDecimal.ROUND_HALF_EVEN));
		Ingredientes bacon = new Ingredientes(2L, "Bacon",0, new BigDecimal(2.00).setScale(2, BigDecimal.ROUND_HALF_EVEN));
		Ingredientes hamburger = new Ingredientes(3L, "Hambúrger de carne", 0, new BigDecimal(3.00).setScale(2, BigDecimal.ROUND_HALF_EVEN));
		Ingredientes ovo = new Ingredientes(4L, "Ovo", 0,  new BigDecimal(0.80).setScale(2, BigDecimal.ROUND_HALF_EVEN));
		Ingredientes queijo = new Ingredientes(5L, "Queijo", 0, new BigDecimal(1.50).setScale(2, BigDecimal.ROUND_HALF_EVEN));

		ingredientesList.addAll(new ArrayList<>(Arrays.asList(alface, bacon, hamburger, ovo, queijo)));

	}


	public List<Ingredientes> getListaIngredientes() {
		return ingredientesList;
	}


}
