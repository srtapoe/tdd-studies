package com.oliveira.notas_alunos;

public class Turma {
	
	public static void main(String[] args) {
		
		
		Student student = new Student();
		student.matricula = "200000";
		student.nota1 = 8.8;
		student.nota2 = 8.9;
		student.nota3 = 10.0;
		
		System.out.println(student.matricula);
		System.out.println(student.nota1);
		System.out.println(student.nota2);
		System.out.println(student.nota3);
		
		
	}

}
