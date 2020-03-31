package br.com.compasso.brBanco.model;

public enum Notas {
	
	CEM(100.0),
	CINQUENTA(50.0),
	VINTE(20.0),
	DEZ(10.0);
	
	private final Double valor;
	
	private Notas(Double valor) {
		this.valor = valor;
	}
	
	public Double getValor() {
		return valor;
	}
}
