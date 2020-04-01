/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpa.
 * 
 * Exemplo: entrada 12// saída ímpar
 * 
 */


package exerciciosJava2;

import java.util.Scanner;

public class ParOuImpar {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int X = scanner.nextInt();
	    
		if (X % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Ímpar");
		}

		scanner.close();
	}
}


