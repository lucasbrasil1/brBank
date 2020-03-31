package br.com.compasso.brBanco.model;

public class Dinheiro {

	private Notas nota;
	private int quantidade;
	
	public Dinheiro(Notas nota, int quantidade) {
		this.nota = nota;
		this.quantidade = quantidade;
	}

	public double getNota() {
		return nota.getValor();
	}

	public void setNota(Notas nota) {
		this.nota = nota;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
