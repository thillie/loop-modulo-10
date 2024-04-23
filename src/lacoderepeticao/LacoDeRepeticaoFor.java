package lacoderepeticao;

import java.util.Scanner;

public class LacoDeRepeticaoFor {

	public static void main(String[] args) {
		/* Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e 
		 * mostre na tela quantos números são pares e quantos número são ímpares. Veja o exemplo abaixo:*/
		
		Scanner leia = new Scanner(System.in);
		
		int numerospares = 0, numerosimpares = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Digite o número " + i + ":");
			
			int num = leia.nextInt();
			
			if (num % 2 == 0) {
				
				numerospares++;
				
			} else  {
				
				numerosimpares++;
				
			}
	
		}
	
		System.out.println("Quantidade de números pares: " + numerospares);
		
		System.out.println("Quantidade de números ímpares: " + numerosimpares);

			
	}

}
