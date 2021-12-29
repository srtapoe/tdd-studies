package com.oliveira.calcula_media;

import java.util.Scanner;

public class Aluno {
	Scanner dadosEntrada = new Scanner(System.in);
	double nota1, nota2, nota3, mediaAcumulada;
	int qtdeAlunos;
	
	//os metodos para pegar as notas pelo teclado e acumular as medias
	//dos alunos para tirar media dos alunos só serão implementados na
	//refatoração(terceira nota)
	
	double calcularMedia(double nota1,double nota2,double nota3) {
		
		if(nota1 < 0 || nota2 < 0 || nota3 < 0) {
			throw new RuntimeException("Números negativos ou maiores que 10 não são permitidos");	
	}
		double notas [] = {nota1, nota2, nota3};
	
		double menor = notas[0];
		
		for(int i = 0; i<notas.length;i++) {
			if(notas[i]<=menor) {
				menor = notas[i];
			}
		}
		
		double media = (nota1 + nota2 + nota3) / 3;
		if(media>=7) {
			return media;
		}else {
			double nota4 = dadosEntrada.nextDouble();
			if(nota4 <= nota1 || nota4 <= nota2 || nota4 <= nota3) {
				return media;
			}else {
				//aqui é para chamar o Scanner, mas usei 10 para evitar conflitos nos testes
				media = ((nota1 + nota2 + nota3 + nota4) - menor) / 3;
				return media;
			}
				
		}
			
	}
	
	
}

//metodos de captura de dados(notas e quantidade de alunos = máx 5
/*	qtdeAlunos = dadosEntrada.nextInt();
 * int j = 0;
		while(j < qtdeAlunos) {
				
					
		System.out.println("Matricula do aluno: ");
		matricula = dadosEntrada.next();
					
			        // recebe a 1º nota
		System.out.print("1° nota do aluno " + matricula + ": ");
		nota1 = dadosEntrada.nextDouble();
			        
			        // recebe a 2º nota
	   System.out.print("2° nota do aluno " + matricula + ": ");
	   nota2 = dadosEntrada.nextDouble();
			        
			        // recebe a 3º nota
	   System.out.print("3° nota do aluno " + matricula + ": ");
	   nota3 = dadosEntrada.nextDouble();
			        j++;
 */

//metodo de soma das medias dos alunos cadastrados
/*
	mediaAcumulada += mediaAluno;
	System.out.printf("Média da turma: %.2f \n ", mediaAcumulada / qtdeAlunos);
*/