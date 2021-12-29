package com.oliveira.calcula_media;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AlunoTeste {

	
	@Test
	public void calculandoMedia() {
		
		
		//cenario
		Aluno aluno = new Aluno();
		double nota1 = 10, nota2 = 10, nota3 = 10;
		
		//execução
		
		double resultadoEsperado = aluno.calcularMedia(nota1, nota2, nota3);
	
		
		//verificação
		Assertions.assertThat(resultadoEsperado).isEqualTo(10);
		
	}
	
	
	@Test(expected = RuntimeException.class)
	public void testandoEntradaNumerosNegativos() {
		//cenario
		Aluno aluno = new Aluno();
		double nota1 = -1, nota2 = 10, nota3 = 10;
		
		
		//execução
		double resultadoEsperado = aluno.calcularMedia(nota1, nota2, nota3);
			
				
		//verificação
		Assertions.assertThat(resultadoEsperado).isEqualTo(6.33);
	}
	
	
	@Test
	public void verificarNotaQuatroIgualAlgumaDasOutrasNotas() {
		//cenario
				Aluno aluno = new Aluno();
				double nota1 = 5, nota2 = 6, nota3 = 6.5, nota4 = 5;
				
				//execução
				
				double resultadoEsperado = aluno.calcularMedia(nota1, nota2, nota3);
			
			
				
				//verificação
				Assertions.assertThat(resultadoEsperado).isEqualTo(5.83);
}
}