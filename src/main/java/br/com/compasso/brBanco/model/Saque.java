package br.com.compasso.brBanco.model;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import br.com.compasso.brBanco.service.CalculadorDeNotas;

public class Saque {

	private Long id;
	private Double valorASerSacado;
	private LocalDateTime dataDeSaque = LocalDateTime.now();
	
	public List<Dinheiro> getListaDeNotas(){
		return Collections.unmodifiableList(new CalculadorDeNotas(this.valorASerSacado).getListaDeCedulas());
	}

	public Saque(Double valor) {
		this.valorASerSacado = valor;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public Double getValorASerSacado() {
		return valorASerSacado;
	}

	public void setValorASerSacado(Double valorASerSacado) {
		this.valorASerSacado = valorASerSacado;
	}

	public LocalDateTime getDataDeSaque() {
		return dataDeSaque;
	}

	public void setDataDeSaque(LocalDateTime dataDeSaque) {
		this.dataDeSaque = dataDeSaque;
	}

}
