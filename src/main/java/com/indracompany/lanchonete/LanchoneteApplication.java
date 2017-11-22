package com.indracompany.lanchonete;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.indracompany.lanchonete.model.Ingredientes;
import com.indracompany.lanchonete.model.Lanche;
import com.indracompany.lanchonete.model.Pedido;
import com.indracompany.lanchonete.service.PedidoService;

@SpringBootApplication
public class LanchoneteApplication {

/*
 * {
    "0": {
        "idPedido": 0,
        "listaPedido": [
            {
                "nomeLanche": "X-Bacon",
                "ingredientesLanche": [
                    {
                        "nomeIngrediente": "Bacon",
                        "precoIngrediente": 2
                    },
                    {
                        "nomeIngrediente": "Hambúrger de carne",
                        "precoIngrediente": 3
                    },
                    {
                        "nomeIngrediente": "Queijo",
                        "precoIngrediente": 1.5
                    }
                ]
            }
        ],
        "totalPedido": 6.5
    }
}
 */

	public static void main(String[] args) {
		SpringApplication.run(LanchoneteApplication.class, args);
	}

	@Bean
	public CommandLineRunner setup(PedidoService pedidoService) {
		return (args) -> {


			Ingredientes alface = new Ingredientes(1L, "Alface", 0,  new BigDecimal(0.40));
			Ingredientes bacon = new Ingredientes(2L, "Bacon",1, new BigDecimal(2.00));
			Ingredientes hamburger = new Ingredientes(3L, "Hambúrger de carne", 1, new BigDecimal(3.00));
			Ingredientes ovo = new Ingredientes(4L, "Ovo", 0,  new BigDecimal(0.80));
			Ingredientes queijo = new Ingredientes(5L, "Queijo", 1, new BigDecimal(1.50));


			Lanche xbacon = new Lanche(1L, "X-Bacon", new ArrayList<>(Arrays.asList(alface, bacon, hamburger, ovo, queijo)));

			Pedido pedido = new Pedido(xbacon, new BigDecimal(6.50));
			pedidoService.addPedido(pedido);
		};
	}

}
