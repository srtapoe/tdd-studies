package com.oliveira.cadastrosuperherois;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CadastroSuperHeroisTest {

	
	@Test
	public void criarCadastroSuperHerois() {
		
		CadastroSuperHerois cadastro = new CadastroSuperHerois();
		
		
		Assertions.assertThat(cadastro.getSuperHerois()).isEmpty();
	}
	
	@Test
	public void adicionarSuperHeroi() {
		
		CadastroSuperHerois cadastroSuperHerois = new CadastroSuperHerois();
		
		SuperHeroi superHeroi = new SuperHeroi("Bruce Wayne", "Batman", "Super Rico");
		
		cadastroSuperHerois.adicionar(superHeroi);
		
		Assertions
				.assertThat(cadastroSuperHerois.getSuperHerois())
				.isNotEmpty()
				.hasSize(1)
				.contains(superHeroi);
	}
	
	@Test( expected = SuperHeroiSemNotException.class)
	public void camposDeEntradaVazios() {
		
		//cenario
		CadastroSuperHerois cadastroSuperHerois = new CadastroSuperHerois();
		SuperHeroi superHeroi = new SuperHeroi();
		
		//execucao
		cadastroSuperHerois.adicionar(superHeroi);
	}
	
	@Test
	public void removerSuperHeroi() {
		//cenario
		CadastroSuperHerois cadastroSuperHerois = new CadastroSuperHerois();
		SuperHeroi superHeroi = new SuperHeroi();
		
		superHeroi.setCodinome("Flash");
		superHeroi.setNomeVerdadeiro("Barry Allen");
		superHeroi.setSuperPoder("Velocidade da luz");
	
		cadastroSuperHerois.adicionar(superHeroi);
		
		//execucao
		cadastroSuperHerois.remover(superHeroi);
		
		//verificacao
		Assertions.assertThat(cadastroSuperHerois.getSuperHerois()).isEmpty();
	}
	
	@Test(expected = SuperHeroiNaoCadastradoException.class)
	public void removerSuperHeroiNaoExistenteNoBanco() {
		CadastroSuperHerois cadastroSuperHerois = new CadastroSuperHerois();
		SuperHeroi superHeroi = new SuperHeroi();
		
		cadastroSuperHerois.remover(superHeroi);
	}
}
