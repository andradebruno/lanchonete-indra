package com.indracompany.lanchonete.controllers.forms;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import com.indracompany.lanchonete.model.Ingredientes;
import com.indracompany.lanchonete.model.Lanche;
import com.indracompany.lanchonete.model.Pedido;
import com.indracompany.lanchonete.service.LancheService;

public class PedidoForm {

	public interface ValidacaoCalcular {

	}

	public interface ValidacaoSubmit {

	}

	@NotNull(groups = {ValidacaoCalcular.class, ValidacaoSubmit.class })
	private Long idLanche;
	@NotNull(groups = {ValidacaoCalcular.class, ValidacaoSubmit.class })
	@PositiveOrZero(groups = {ValidacaoCalcular.class, ValidacaoSubmit.class })
	private Integer alface;
	@NotNull(groups = {ValidacaoCalcular.class, ValidacaoSubmit.class })
	@PositiveOrZero(groups = {ValidacaoCalcular.class, ValidacaoSubmit.class })
	private Integer bacon;
	@NotNull(groups = {ValidacaoCalcular.class, ValidacaoSubmit.class })
	@PositiveOrZero(groups = {ValidacaoCalcular.class, ValidacaoSubmit.class })
	private Integer carne;
	@NotNull(groups = {ValidacaoCalcular.class, ValidacaoSubmit.class })
	@PositiveOrZero(groups = {ValidacaoCalcular.class, ValidacaoSubmit.class })
	private Integer ovo;
	@NotNull(groups = {ValidacaoCalcular.class, ValidacaoSubmit.class })
	@PositiveOrZero(groups = {ValidacaoCalcular.class, ValidacaoSubmit.class })
	private Integer queijo;
	@NotNull(groups = {ValidacaoSubmit.class })
	@Positive(groups = {ValidacaoSubmit.class })
	private BigDecimal total;

	public Long getIdLanche() {
		return idLanche;
	}

	public void setIdLanche(Long idLanche) {
		this.idLanche = idLanche;
	}

	public Integer getAlface() {
		return alface;
	}

	public void setAlface(Integer alface) {
		this.alface = alface;
	}

	public Integer getBacon() {
		return bacon;
	}

	public void setBacon(Integer bacon) {
		this.bacon = bacon;
	}

	public Integer getCarne() {
		return carne;
	}

	public void setCarne(Integer carne) {
		this.carne = carne;
	}

	public Integer getOvo() {
		return ovo;
	}

	public void setOvo(Integer ovo) {
		this.ovo = ovo;
	}

	public Integer getQueijo() {
		return queijo;
	}

	public void setQueijo(Integer queijo) {
		this.queijo = queijo;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Pedido build(LancheService lancheService) {

		Ingredientes alface = new Ingredientes(1L, "Alface", getAlface(), new BigDecimal(0.40).setScale(2, BigDecimal.ROUND_HALF_EVEN));
		Ingredientes bacon = new Ingredientes(2L, "Bacon", getBacon(), new BigDecimal(2.00).setScale(2, BigDecimal.ROUND_HALF_EVEN));
		Ingredientes hamburger = new Ingredientes(3L, "Hambúrger de carne", getCarne(), new BigDecimal(3.00).setScale(2, BigDecimal.ROUND_HALF_EVEN));
		Ingredientes ovo = new Ingredientes(4L, "Ovo", getOvo(), new BigDecimal(0.80).setScale(2, BigDecimal.ROUND_HALF_EVEN));
		Ingredientes queijo = new Ingredientes(5L, "Queijo", getQueijo(), new BigDecimal(1.50).setScale(2, BigDecimal.ROUND_HALF_EVEN));

		setTotal(lancheService.calculaIngredientes(new ArrayList<>(Arrays.asList(alface, bacon, hamburger, ovo, queijo))));

		Lanche lanche = new Lanche(1L, lancheService.buscaNomeLanche(getIdLanche()), new ArrayList<>(Arrays.asList(alface, bacon, hamburger, ovo, queijo)));

		return new Pedido(lanche, this.total);

	};

}
