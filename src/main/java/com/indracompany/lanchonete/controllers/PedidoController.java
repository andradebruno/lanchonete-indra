package com.indracompany.lanchonete.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.indracompany.lanchonete.controllers.forms.PedidoForm;
import com.indracompany.lanchonete.model.Pedido;
import com.indracompany.lanchonete.service.LancheService;
import com.indracompany.lanchonete.service.PedidoService;

@RestController
@RequestMapping({ "/api" })
@CrossOrigin
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	@Autowired
	private LancheService lancheService;

	@GetMapping("/pedidos")
	public Iterable<Pedido> getAllPedidos() {

		return pedidoService.getPedidos();

	}

	@PostMapping("/pedidos")
	@ResponseStatus(value=HttpStatus.OK)
	public Iterable<Pedido> addPedido(@RequestBody @Validated(PedidoForm.ValidacaoSubmit.class) PedidoForm pedido) throws Exception {

		pedidoService.addPedido(pedido.build(this.lancheService));

		return getAllPedidos();

	}


}
