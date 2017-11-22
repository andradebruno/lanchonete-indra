package com.indracompany.lanchonete.model;

import java.math.BigDecimal;

public class Pedido {

	private Long idPedido;
	private Lanche lanchePedido;
	private BigDecimal totalPedido;

	public Pedido() {

	}

	public Pedido(Lanche pedidoLanche, BigDecimal totalPedido) {
		super();

		this.lanchePedido = pedidoLanche;
		this.totalPedido = totalPedido;
	}


	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Lanche getLanchePedido() {
		return lanchePedido;
	}

	public void setLanchePedido(Lanche lanchePedido) {
		this.lanchePedido = lanchePedido;
	}

	public BigDecimal getTotalPedido() {
		return totalPedido;
	}

	public void setTotalPedido(BigDecimal totalPedido) {
		this.totalPedido = totalPedido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPedido == null) ? 0 : idPedido.hashCode());
		result = prime * result + ((lanchePedido == null) ? 0 : lanchePedido.hashCode());
		result = prime * result + ((totalPedido == null) ? 0 : totalPedido.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Pedido other = (Pedido) obj;
		if (idPedido == null) {
			if (other.idPedido != null) {
				return false;
			}
		}
		else if (!idPedido.equals(other.idPedido)) {
			return false;
		}
		if (lanchePedido == null) {
			if (other.lanchePedido != null) {
				return false;
			}
		}
		else if (!lanchePedido.equals(other.lanchePedido)) {
			return false;
		}
		if (totalPedido == null) {
			if (other.totalPedido != null) {
				return false;
			}
		}
		else if (!totalPedido.equals(other.totalPedido)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", pedidoLanche=" + lanchePedido + ", totalPedido=" + totalPedido + "]";
	}




}
