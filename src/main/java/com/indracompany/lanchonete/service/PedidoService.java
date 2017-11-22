package com.indracompany.lanchonete.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.indracompany.lanchonete.model.Pedido;

@Component
public class PedidoService {

	private Map<Long, Pedido> pedidosMap = new HashMap<Long, Pedido>();

	public void addPedido(Pedido pedido) throws Exception {
		if (getPedidosMap().containsKey(pedido.getIdPedido())) {
			throw new Exception("Pedido já está cadastrado.");
		}
		else {
			pedido.setIdPedido(getPedidosMap().size() + 1L);
			getPedidosMap().put(pedido.getIdPedido(), pedido);
		}
	}

	public Iterable<Pedido> getPedidos() {

		return pedidosMap.values();
	}

	public Pedido getPedido(Long idPedido) throws Exception {
		if (getPedidosMap().containsKey(idPedido)) {
			return pedidosMap.get(idPedido);
		}
		else {
			throw new Exception("Pedido não encontrado.");
		}
	}

	public Map<Long, Pedido> getPedidosMap() {
		return pedidosMap;
	}

	public void setPedidosMap(Map<Long, Pedido> pedidosMap) {
		this.pedidosMap = pedidosMap;
	}

}
