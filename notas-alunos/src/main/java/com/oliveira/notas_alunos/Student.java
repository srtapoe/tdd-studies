package com.oliveira.notas_alunos;

import java.util.Scanner;

public class Student {

	
	String matricula;
	double nota1;
	double nota2;
	double nota3;
	
	
	void menorNota(double nota1, double nota2, double nota3) {
		double notas[] = {nota1, nota2,nota3};
        double menorNota = notas[0];
        for(int i = 0; i<notas.length;i++) {
        	if(notas[i] < menorNota) {
        		menorNota = notas[i];
        	}
        }
	}
	
	
	static void calcularMedia(double nota1, double nota2, double nota3) {
		double mediaAluno = (nota1 + nota2 + nota3) / 3;
	}
	
	
	void verificarMedia(double calcularMedia,double menorNota) {
		if(calcularMedia < 7) {
			Scanner dadosEntrada = new Scanner(System.in);
        	System.out.print("Digite a nota substitutiva: ");
        	double nota4 = dadosEntrada.nextDouble();
        	if(nota4 !=nota1 && nota4 !=nota2 && nota4 <= nota3) {
        		double somatorio = (nota1 + nota2 + nota3 + nota4) - menorNota;
	        	double media = somatorio/3;
	        	System.out.printf("A média do aluno %s é %.2f \n ",matricula, media);
        	}
        	
        }else {
        	double media = (nota1 + nota2 + nota3) / 3;
        	System.out.printf("A média do aluno  %s é %.2f \n ", matricula, media);
        }
	}
	
}
