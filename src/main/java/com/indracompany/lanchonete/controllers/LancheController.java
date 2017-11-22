package com.indracompany.lanchonete.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.indracompany.lanchonete.controllers.forms.PedidoForm;
import com.indracompany.lanchonete.model.Ingredientes;
import com.indracompany.lanchonete.model.Lanche;
import com.indracompany.lanchonete.service.LancheService;

@RestController
@RequestMapping({ "/api" })
@CrossOrigin
public class LancheController {

	@Autowired
	private LancheService lancheService;

	@GetMapping("/lanches")
	public Iterable<Lanche> getListaLanches() {
		return lancheService.getListaLanches();
	}

	@GetMapping("/lanche/{idLanche}")
	public List<Ingredientes> buscaLanche(@PathVariable("idLanche") Long idLanche) throws Exception {

		return lancheService.buscaLancheIngredientes(idLanche);

	}

	@PostMapping("/lanche/calcula")
	@ResponseStatus(value=HttpStatus.OK)
	public BigDecimal calculaIngredientes(@RequestBody @Validated(PedidoForm.ValidacaoCalcular.class) PedidoForm pedido) throws Exception {

		return lancheService.calculaIngredientes(pedido.build(this.lancheService).getLanchePedido().getIngredientesLanche());


	}
}
