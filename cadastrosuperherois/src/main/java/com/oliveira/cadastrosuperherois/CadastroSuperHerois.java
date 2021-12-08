package com.oliveira.cadastrosuperherois;

import java.util.ArrayList;
import java.util.List;


public class CadastroSuperHerois {
	
	private List<SuperHeroi> superHerois;

	
	public CadastroSuperHerois() {
		this.superHerois = new ArrayList<>();
	}
	
	public List<SuperHeroi> getSuperHerois() {
		return this.superHerois;
	}

	public void adicionar(SuperHeroi superHeroi) {
		if(superHeroi.getNomeVerdadeiro() == null) {
			throw new SuperHeroiSemNotException();
		}
		this.superHerois.add(superHeroi);
		
	}

	public void remover(SuperHeroi superHeroi) {
		if(this.superHerois.isEmpty()) {
			throw new SuperHeroiNaoCadastradoException();
		}
		this.superHerois.remove(superHeroi);
		
	}

}
