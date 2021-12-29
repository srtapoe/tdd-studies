package com.oliveira.notas_alunos;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AlunoTeste {

	Aluno aluno = new Aluno();
	
	@Test
	public void verificarRequisitosDaNotaquatro() {
		//cenario
		double nota1 = 10;
		double nota2 = 10;
		double nota3 = 10;
		
		double media [] = {nota1, nota2, nota3};
		
		//execucao
	aluno.verificarMedia(media);
		
	
	Assertions.assertThat(media).isEqualTo(10);
	
	
	}
	
	
	
	
	
	
}
