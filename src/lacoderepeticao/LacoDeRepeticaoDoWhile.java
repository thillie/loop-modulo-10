package lacoderepeticao;

import java.util.Scanner;

public class LacoDeRepeticaoDoWhile {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
		 * Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos.*/

		Scanner leia = new Scanner (System.in);
		
		int numinteiros = 0;
		int soma = 0;
		
		do { 
			System.out.println("Digite um número: ");
			
			numinteiros = leia.nextInt();
			
			if (numinteiros >= 0) {
				
				soma = soma + numinteiros;
				
			}
			
		} while(numinteiros != 0);
		
			System.out.println("A soma dos números positivos é: " + soma);
		
	}

}
