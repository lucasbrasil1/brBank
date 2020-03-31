package br.com.compasso.brBanco.controller.dto;

import java.util.Collections;
import java.util.List;

import br.com.compasso.brBanco.model.Dinheiro;
import br.com.compasso.brBanco.model.Saque;

public class SaqueDto {

	private List<Dinheiro> listaDeNotas;
	
	public SaqueDto(Saque saque) {
		this.setListaDeNotas(saque.getListaDeNotas());
	}
	
	public List<Dinheiro> getListaDeNotas() {
		return Collections.unmodifiableList(listaDeNotas);
	}


	public void setListaDeNotas(List<Dinheiro> listaDeNotas) {
		this.listaDeNotas = listaDeNotas;
	}
	
	
}
