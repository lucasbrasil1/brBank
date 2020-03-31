package br.com.compasso.brBanco.config.validacao.beans;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidacaoDeDivisao implements ConstraintValidator<DivisivelPor, Double> {
	
	private double divisor;
	
	@Override
	public void initialize(DivisivelPor regra) {
		divisor = regra.divisor();
	}
	
	@Override
	public boolean isValid(Double value, ConstraintValidatorContext context) {
		if(value % divisor == 0) return true;
		return false;
	}
	
}
