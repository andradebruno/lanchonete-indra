package com.indracompany.lanchonete.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.indracompany.lanchonete.model.Ingredientes;
import com.indracompany.lanchonete.model.Lanche;

/*X-Bacon Bacon, hambúrguer de carne e queijo

X-Burger Hambúrguer de carne e queijo

X-Egg Ovo, hambúrguer de carne e queijo

X-Egg Bacon Ovo, bacon, hambúrguer de carne e queijo*/

@Component
public class LancheService {

	private static List<Lanche> lancheList = new ArrayList<>();

	static {

		Lanche xbacon = new Lanche(1L, "X-Bacon",
				new ArrayList<>(Arrays.asList(new Ingredientes(1L, "Alface", 0, new BigDecimal(0.40)), new Ingredientes(2L, "Bacon", 1, new BigDecimal(2.00)),
						new Ingredientes(3L, "Hambúrger de carne", 1, new BigDecimal(3.00)), new Ingredientes(4L, "Ovo", 0, new BigDecimal(0.80)),
						new Ingredientes(5L, "Queijo", 1, new BigDecimal(1.50)))));

		Lanche xburger = new Lanche(2L, "X-Burger",
				new ArrayList<>(Arrays.asList(new Ingredientes(1L, "Alface", 0, new BigDecimal(0.40)), new Ingredientes(2L, "Bacon", 0, new BigDecimal(2.00)),
						new Ingredientes(3L, "Hambúrger de carne", 1, new BigDecimal(3.00)), new Ingredientes(4L, "Ovo", 0, new BigDecimal(0.80)),
						new Ingredientes(5L, "Queijo", 1, new BigDecimal(1.50)))));

		Lanche xegg = new Lanche(3L, "X-Egg",
				new ArrayList<>(Arrays.asList(new Ingredientes(1L, "Alface", 0, new BigDecimal(0.40)), new Ingredientes(2L, "Bacon", 0, new BigDecimal(2.00)),
						new Ingredientes(3L, "Hambúrger de carne", 1, new BigDecimal(3.00)), new Ingredientes(4L, "Ovo", 1, new BigDecimal(0.80)),
						new Ingredientes(5L, "Queijo", 1, new BigDecimal(1.50)))));

		Lanche xeggbacon = new Lanche(4L, "X-Egg Bacon",
				new ArrayList<>(Arrays.asList(new Ingredientes(1L, "Alface", 0, new BigDecimal(0.40)), new Ingredientes(2L, "Bacon", 1, new BigDecimal(2.00)),
						new Ingredientes(3L, "Hambúrger de carne", 1, new BigDecimal(3.00)), new Ingredientes(4L, "Ovo", 1, new BigDecimal(0.80)),
						new Ingredientes(5L, "Queijo", 1, new BigDecimal(1.50)))));

		lancheList.addAll(new ArrayList<>(Arrays.asList(xbacon, xburger, xegg, xeggbacon)));

	}

	public List<Ingredientes> buscaLancheIngredientes(Long idLanche) {

		for (Lanche lanche : lancheList) {
			if (lanche.getIdLanche() == idLanche) {
				return lanche.getIngredientesLanche();
			}
		}

		return null;

	}

	public BigDecimal calculaIngredientes(List<Ingredientes> ingredientesLista) {

		BigDecimal itemCost = BigDecimal.ZERO;
		BigDecimal total = BigDecimal.ZERO;
		boolean ativoPromocao = false;
		boolean temAlface = false;
		boolean temBacon = false;


		for (Ingredientes ingredientes : ingredientesLista) {

			if ((ingredientes.getIdIngrediente() == 1 && ingredientes.getQuantidadeIngrediente() >= 1) && ativoPromocao == false) {
				temAlface = true;
			}

			if ((ingredientes.getIdIngrediente() == 2 && ingredientes.getQuantidadeIngrediente() >= 1) && ativoPromocao == false) {
				temBacon = true;
			}


			if ((ingredientes.getIdIngrediente() == 3 || ingredientes.getIdIngrediente() == 5) && ativoPromocao == false
					&& (ingredientes.getQuantidadeIngrediente() % 3 == 0)) {
				ingredientes.setQuantidadeIngrediente((ingredientes.getQuantidadeIngrediente() / 3) * 2);
				ativoPromocao = true;
			}

			itemCost = (ingredientes.getPrecoIngrediente().multiply(new BigDecimal(ingredientes.getQuantidadeIngrediente())));
			total = total.add(itemCost);

		}

		if (temAlface == true && temBacon == false && ativoPromocao == false) {
			System.out.println(temAlface);
			System.out.println(temBacon);
			System.out.println(ativoPromocao);
			total = total.subtract(total.multiply(new BigDecimal(10)).divide(new BigDecimal(100)));
		}

		System.out.println("Total em baixo: " + total);
		return total;
	}

	public String buscaNomeLanche(Long idLanche) {
		for (Lanche lanche : lancheList) {
			if (lanche.getIdLanche() == idLanche) {
				return lanche.getNomeLanche();
			}
		}

		return null;

	}

	public List<Lanche> getListaLanches() {
		return lancheList;
	}

}
