package com.oliveira.cadastrosuperherois;

public class SuperHeroi {

	private String nomeVerdadeiro;
	private String codinome;
	private String superPoder;
	
	
	public String getNomeVerdadeiro() {
		return nomeVerdadeiro;
	}

	public void setNomeVerdadeiro(String nomeVerdadeiro) {
		this.nomeVerdadeiro = nomeVerdadeiro;
	}


	public String getCodinome() {
		return codinome;
	}


	public void setCodinome(String codinome) {
		this.codinome = codinome;
	}


	public String getSuperPoder() {
		return superPoder;
	}


	public void setSuperPoder(String superPoder) {
		this.superPoder = superPoder;
	}


	public SuperHeroi(String nomeVerdadeiro, String codinome, String superPoder) {
		super();
		this.nomeVerdadeiro = nomeVerdadeiro;
		this.codinome = codinome;
		this.superPoder = superPoder;
	}

	public SuperHeroi() {
		
	}
	
	
}
