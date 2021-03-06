package primeiroteste;

import org.junit.Test;

import org.assertj.core.api.Assertions;

public class PrimeiroTeste {

	//soma
	@Test
	public void testandoSoma() {
		
		//cenario
		Calculadora calculadora = new Calculadora();
		int numero1 = 10, numero2 = 2;
		
		//execução
		int resultado = calculadora.somar(numero1,numero2);
	
		
		//verificação
		Assertions.assertThat(resultado).isEqualTo(12);
	}
	
	@Test(expected = RuntimeException.class)
	public void testandoEntradaNumerosNegativos() {
		//cenario
		Calculadora calculadora = new Calculadora();
		int numero1 =  - 10, numero2 = 2;
				
		//execução
		int resultado = calculadora.somar(numero1,numero2);
			
				
		//verificação
		Assertions.assertThat(resultado).isEqualTo(12);
	}
	
	//multiplicação
	@Test
	public void testandoMultiplicao() {
		//cenario
		Calculadora calculadora = new Calculadora();
		int numero1 =   10, numero2 = 2;
				
		//execução
		int resultado = calculadora.multiplicar(numero1,numero2);
			
				
		//verificação
		Assertions.assertThat(resultado).isEqualTo(20);
	}
	
	//subtração
		@Test
		public void testandoSubtracao() {
			//cenario
			Calculadora calculadora = new Calculadora();
			int numero1 = 10, numero2 = 2;
					
			//execução
			int resultado = calculadora.subtrair(numero1,numero2);
				
					
			//verificação
			Assertions.assertThat(resultado).isEqualTo(8);
		}
		
		//divisão
		@Test(expected = RuntimeException.class)
		public void testandoDivisao() {
			//cenario
			Calculadora calculadora = new Calculadora();
			int numero1 =  0, numero2 = 2;
					
			//execução
			int resultado = calculadora.divisao(numero1,numero2);
				
					
			//verificação
			Assertions.assertThat(resultado).isEqualTo(2);
		}
}
