package Exercicio;

import java.util.Scanner;

public class P3PRF {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		double [] valores = {5,1,6,1,4};
		Estatistica a = new Estatistica();

		Estatistica.imprimeValores(valores);
		a.ordena(valores);
		System.out.println("\nVetor em ordem crescente:");
		Estatistica.imprimeValores(valores);
		a.media(valores);
		System.out.println("\nMédia: " + a.media(valores));
		a.moda(valores);
		System.out.println("\nModa: " + a.moda(valores));
		a.mediana(valores);
		System.out.println("\nMediana: " + a.mediana(valores));
		a.variancia(valores);
		System.out.println("\nVariância: " + a.variancia(valores));
		a.desvioPadrao(valores);
		System.out.println("\nDesvio Padrão: " + a.desvioPadrao(valores));
		
		scanner.close();
	}
}
