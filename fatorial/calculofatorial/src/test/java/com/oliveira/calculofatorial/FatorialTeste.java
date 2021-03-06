package com.oliveira.calculofatorial;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FatorialTeste {
	
	
	Fatorial fatorial = new Fatorial();
	

	//entrada de numeros negativos
	@Test(expected = RuntimeException.class)
	public void calculoFatorialNumerosNegativos() {
		
		//cenario
		int numeroNegativo = - 2;
		
		//execucao
		int fat = fatorial.calculoFatorial(numeroNegativo);

		//verificação
		Assertions.assertThat(fat).isEqualTo(-2);
		
	}
	
	@Test
	public void calculoFatorialEntradaZero() {
		
		
		//cenario
		int numero = 0;
		
		//execucao
		int fat = fatorial.calculoFatorial(numero);

		//verificação
		Assertions.assertThat(fat).isEqualTo(1);
		
	}
	
	@Test
	public void calculoFatorialEntradaNormal() {
		
		
		//cenario
		int numero = 4;
		
		//execucao
		int fat = fatorial.calculoFatorial(numero);

		//verificação
		Assertions.assertThat(fat).isEqualTo(24);
		
	}


}
