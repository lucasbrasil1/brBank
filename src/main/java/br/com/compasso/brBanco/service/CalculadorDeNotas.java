package br.com.compasso.brBanco.service;

import java.util.ArrayList;
import java.util.List;

import br.com.compasso.brBanco.model.Dinheiro;
import br.com.compasso.brBanco.model.Notas;

public class CalculadorDeNotas {

	private List<Dinheiro> listaDeCedulas = new ArrayList<Dinheiro>();
	private Double valor;
	
	public CalculadorDeNotas(Double valor) {
		this.valor = valor;
		iteraNotas();
	}

	private void iteraNotas() {
		for(Notas nota : Notas.values()) {
			this.listaDeCedulas.add(new Dinheiro(nota, quantidadeDeNotas(nota)));
			valor = restanteDoValor(nota);
		}
	}
	
	public List<Dinheiro> executa() {
		return listaDeCedulas;
	}
	
	public int quantidadeDeNotas(Notas nota) {
		return (int) (this.valor / nota.getValor());
	}
	
	public Double restanteDoValor(Notas nota) {
		return this.valor % nota.getValor();
	}
	
}
