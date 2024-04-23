package lacoderepeticao;

import java.util.Scanner;

public class LacoDeRepeticaoWhile {

	public static void main(String[] args) {
		/* Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela 
		 * o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. 
		 * A leitura dos dados deve ser finalizada ao digitar uma idade negativa.*/
		
		Scanner leia = new Scanner (System.in);
		
		int idades = 0;
		int maior50 = 0, menor21 = 0;
		
		while(idades >= 0) {
			
			System.out.println("Digite uma idade: ");
			
			idades = leia.nextInt();
			
			if (idades > 50 && idades >= 0) {
				
				maior50++;
				
			} else if (idades < 21 && idades >= 0) {
				
				menor21++;
				
			}
			
		}
		System.out.println("Total de pessoas menores de 21 anos: " + menor21);
		
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);

	}

}
