package br.com.compasso.brBanco.model;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import br.com.compasso.brBanco.service.CalculadorDeNotas;

public class Saque {

	private Long id;
	private Double valorASerSacado;
	private LocalDateTime dataDeSaque = LocalDateTime.now();
	private List<Dinheiro> cedulasParaSaque;
	
	public Saque(Double valor) {
		this.valorASerSacado = valor;
		cedulasParaSaque = new CalculadorDeNotas(this.valorASerSacado).executa();
	}
	
	public List<Dinheiro> getListaDeNotas(){
		return Collections.unmodifiableList(cedulasParaSaque);
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
