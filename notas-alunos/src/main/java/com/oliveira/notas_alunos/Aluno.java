package com.oliveira.notas_alunos;

import java.util.Scanner;

public class Aluno {

	//resolução com tudo dentro menos o calculo de todas as medias
	//e mostrar todas as médias dos alunos cadastrados
	public static void main(String[] args) {
		Scanner dadosEntrada = new Scanner(System.in);
			//variaveis a serem usadas
			double nota1, nota2, nota3;
			double mediaAluno, mediaTurma, menorNota;
			String matricula;
			int qtdeAlunos, i = 0, alunosCadastrados;
			
			//entrada da quantidade de alunos
				System.out.println("====Máximo 5 alunos====");
				System.out.print("Digite a quantidade de alunos: ");
				qtdeAlunos = dadosEntrada.nextInt();
				
			//dados dos alunos
				int j = 0;
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
			        
			        // calcula a média
			        mediaAluno = (nota1 + nota2 + nota3) / 3;
			        
					
			        double notas[] = {nota1, nota2,nota3};
			        menorNota = notas[0];
			        for(i = 0; i<notas.length;i++) {
			        	if(notas[i] < menorNota) {
			        		menorNota = notas[i];
			        	}
			        }
			        
			        
			        
					//solicita uma quarta nota se a média for menor que 7
			        if(mediaAluno < 7) {
			        	System.out.print("Digite a nota substitutiva: ");
			        	double nota4 = dadosEntrada.nextDouble();
			        	if(nota4 !=nota1 && nota4 !=nota2 && nota4 <= nota3) {
			        		double somatorio = (nota1 + nota2 + nota3 + nota4) - menorNota;
				        	mediaAluno = somatorio/3;
			        	}
			        	System.out.printf("A média do aluno %s é %.2f \n ",matricula, mediaAluno);
			        }else {
			        	mediaAluno = (nota1 + nota2 + nota3) / 3;
			        	System.out.printf("A média do aluno  %s é %.2f \n ", matricula, mediaAluno);
			        }
			        
			        
					j++;
				}
		}
		
		
		
		
	}

