package br.com.compasso.brBanco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.compasso.brBanco.controller.form.SaqueForm;
import br.com.compasso.brBanco.model.Dinheiro;
import br.com.compasso.brBanco.model.Notas;
import br.com.compasso.brBanco.model.Saque;

@SpringBootTest
class BrBancoApplicationTests {

	@Test
	public void testaFuncionalidadeDoSaque() {
		Saque saque = new Saque(880.0);
		
		List<Dinheiro> listaDeNotas = new ArrayList<Dinheiro>();
		
		listaDeNotas.add(new Dinheiro(Notas.CEM, 8));
		listaDeNotas.add(new Dinheiro(Notas.CINQUENTA, 1));
		listaDeNotas.add(new Dinheiro(Notas.VINTE, 1));
		listaDeNotas.add(new Dinheiro(Notas.DEZ, 1));
		
		assertEquals(saque.getListaDeNotas().get(0).getQuantidade(), listaDeNotas.get(0).getQuantidade());
		assertEquals(saque.getListaDeNotas().get(1).getQuantidade(), listaDeNotas.get(1).getQuantidade());
		assertEquals(saque.getListaDeNotas().get(2).getQuantidade(), listaDeNotas.get(2).getQuantidade());
		assertEquals(saque.getListaDeNotas().get(3).getQuantidade(), listaDeNotas.get(3).getQuantidade());
	}

	@Test
	@org.junit.Test(expected = RuntimeException.class)
	public void testaValorNaoDivisivel() {
		SaqueForm form = new SaqueForm();
		form.setValor(1234.0);
	}
	
	@Test
	@org.junit.Test(expected = RuntimeException.class)
	public void testaValorMenorQueDez() {
		SaqueForm form = new SaqueForm();
		form.setValor(9.0);
	}
	
	@Test
	@org.junit.Test(expected = RuntimeException.class)
	public void testaValorSaqueMenorQueZero() {
		SaqueForm form = new SaqueForm();
		form.setValor(-9.0);
	}
	
	
}
