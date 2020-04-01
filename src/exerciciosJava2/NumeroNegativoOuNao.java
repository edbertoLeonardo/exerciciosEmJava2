/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. 
 * Exemplo: 
 * Entrada: -10 // saída: Negativo
 */

package exerciciosJava2;

import java.util.Scanner;

public class NumeroNegativoOuNao {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
	    
		if (X < 0) {
			System.out.println("Número n-egativo");
		}
		else {
			System.out.println("Número positivo");
		}

		scanner.close();
	}
}


