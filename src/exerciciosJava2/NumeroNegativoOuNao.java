/*Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o. 
 * Exemplo: 
 * Entrada: -10 // sa�da: Negativo
 */

package exerciciosJava2;

import java.util.Scanner;

public class NumeroNegativoOuNao {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
	    
		if (X < 0) {
			System.out.println("N�mero n-egativo");
		}
		else {
			System.out.println("N�mero positivo");
		}

		scanner.close();
	}
}


