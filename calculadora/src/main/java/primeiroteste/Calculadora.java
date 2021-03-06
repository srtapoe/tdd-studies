package primeiroteste;

import java.util.Scanner;

public class Calculadora {

	Scanner dadosEntrada = new Scanner(System.in);
	int numero1, numero2;

	
	int somar(int numero1, int numero2) {
		if(numero1 < 0 || numero2 < 0) {
			throw new RuntimeException("Números negativos não são permitidos");
		}
		return numero1 + numero2;
	}
	
	int multiplicar(int numero1, int numero2) {
		return numero1 * numero2;
	}
	
	int subtrair(int numero1, int numero2) {
		return numero1 - numero2;
	}
	
	int divisao(int numero1, int numero2) {
		if(numero1 == 0 || numero2 == 0) {
			throw new RuntimeException("Divisão por zero não permitida");
		}
		return numero1 / numero2;
	}
}
