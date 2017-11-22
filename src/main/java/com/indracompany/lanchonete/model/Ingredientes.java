package com.indracompany.lanchonete.model;

import java.math.BigDecimal;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

public class Ingredientes {

	@NotNull
	private Long idIngrediente;
	@NotEmpty
	private String nomeIngrediente;
	@NotNull @PositiveOrZero
	private Integer quantidadeIngrediente;
	@NotNull @PositiveOrZero
	private BigDecimal precoIngrediente;


	public Ingredientes () {};

	public Ingredientes(Long idIngrediente, String nomeIngrediente, Integer quantidadeIngrediente, BigDecimal precoIngrediente) {
		super();
		this.idIngrediente = idIngrediente;
		this.nomeIngrediente = nomeIngrediente;
		this.quantidadeIngrediente = quantidadeIngrediente;
		this.precoIngrediente = precoIngrediente;
	}

	public Long getIdIngrediente() {
		return idIngrediente;
	}

	public void setIdIngrediente(Long idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public String getNomeIngrediente() {
		return nomeIngrediente;
	}

	public void setNomeIngrediente(String nomeIngrediente) {
		this.nomeIngrediente = nomeIngrediente;
	}

	public Integer getQuantidadeIngrediente() {
		return quantidadeIngrediente;
	}

	public void setQuantidadeIngrediente(Integer quantidadeIngrediente) {
		this.quantidadeIngrediente = quantidadeIngrediente;
	}

	public BigDecimal getPrecoIngrediente() {
		return precoIngrediente;
	}

	public void setPrecoIngrediente(BigDecimal precoIngrediente) {
		this.precoIngrediente = precoIngrediente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idIngrediente == null) ? 0 : idIngrediente.hashCode());
		result = prime * result + ((nomeIngrediente == null) ? 0 : nomeIngrediente.hashCode());
		result = prime * result + ((precoIngrediente == null) ? 0 : precoIngrediente.hashCode());
		result = prime * result + ((quantidadeIngrediente == null) ? 0 : quantidadeIngrediente.hashCode());
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
		Ingredientes other = (Ingredientes) obj;
		if (idIngrediente == null) {
			if (other.idIngrediente != null) {
				return false;
			}
		}
		else if (!idIngrediente.equals(other.idIngrediente)) {
			return false;
		}
		if (nomeIngrediente == null) {
			if (other.nomeIngrediente != null) {
				return false;
			}
		}
		else if (!nomeIngrediente.equals(other.nomeIngrediente)) {
			return false;
		}
		if (precoIngrediente == null) {
			if (other.precoIngrediente != null) {
				return false;
			}
		}
		else if (!precoIngrediente.equals(other.precoIngrediente)) {
			return false;
		}
		if (quantidadeIngrediente == null) {
			if (other.quantidadeIngrediente != null) {
				return false;
			}
		}
		else if (!quantidadeIngrediente.equals(other.quantidadeIngrediente)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Ingredientes [idIngrediente=" + idIngrediente + ", nomeIngrediente=" + nomeIngrediente + ", quantidadeIngrediente=" + quantidadeIngrediente
				+ ", precoIngrediente=" + precoIngrediente + "]";
	}




}
