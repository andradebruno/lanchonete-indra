package com.indracompany.lanchonete.model;

import java.util.List;

public class Lanche {

	private Long idLanche;
	private String nomeLanche;
	private List<Ingredientes> ingredientesLanche;


	public Lanche(){};

	public Lanche(Long idLanche, String nomeLanche, List<Ingredientes> ingredientesLanche) {
		super();
		this.idLanche = idLanche;
		this.nomeLanche = nomeLanche;
		this.ingredientesLanche = ingredientesLanche;
	}

	public Long getIdLanche() {
		return idLanche;
	}

	public void setIdLanche(Long idLanche) {
		this.idLanche = idLanche;
	}

	public String getNomeLanche() {
		return nomeLanche;
	}

	public void setNomeLanche(String nomeLanche) {
		this.nomeLanche = nomeLanche;
	}

	public List<Ingredientes> getIngredientesLanche() {
		return ingredientesLanche;
	}

	public void setIngredientesLanche(List<Ingredientes> ingredientesLanche) {
		this.ingredientesLanche = ingredientesLanche;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idLanche == null) ? 0 : idLanche.hashCode());
		result = prime * result + ((ingredientesLanche == null) ? 0 : ingredientesLanche.hashCode());
		result = prime * result + ((nomeLanche == null) ? 0 : nomeLanche.hashCode());
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
		Lanche other = (Lanche) obj;
		if (idLanche == null) {
			if (other.idLanche != null) {
				return false;
			}
		}
		else if (!idLanche.equals(other.idLanche)) {
			return false;
		}
		if (ingredientesLanche == null) {
			if (other.ingredientesLanche != null) {
				return false;
			}
		}
		else if (!ingredientesLanche.equals(other.ingredientesLanche)) {
			return false;
		}
		if (nomeLanche == null) {
			if (other.nomeLanche != null) {
				return false;
			}
		}
		else if (!nomeLanche.equals(other.nomeLanche)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Lanche [idLanche=" + idLanche + ", nomeLanche=" + nomeLanche + ", ingredientesLanche=" + ingredientesLanche + "]";
	}



}
