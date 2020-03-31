package br.com.compasso.brBanco.validator;

import br.com.compasso.brBanco.model.Notas;

public class SaqueValidator {

	private Double menorValor = Double.MAX_VALUE;
	
	public void valida(Double valor) throws Exception {
		if(valorTotalNaoEhDivisivelPelaMenorNota(valor)) {
			throw new Exception("Valor não é divisivel pelo menor valor de nota!");
		}
	}
	
	
	private boolean valorTotalNaoEhDivisivelPelaMenorNota(Double valor) {
		return valor % menorValor > 0;
	}

	public void getMenorValorDeNota() {
		for(Notas nota : Notas.values()){
			if (this.menorValor > nota.getValor())
				this.menorValor = nota.getValor();
		}
	}
	
}
