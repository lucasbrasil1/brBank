package br.com.compasso.brBanco.controller.form;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import br.com.compasso.brBanco.config.validacao.beans.DivisivelPor;
import br.com.compasso.brBanco.model.Saque;

public class SaqueForm {
	
	@NotNull
	@Digits(fraction = 2, integer = 4)
	@DecimalMin(value = "10")
	@Positive
	@DivisivelPor(divisor = 10)
	private Double valor;
	
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Saque converter() {
		return new Saque(this.valor);
	}

}
