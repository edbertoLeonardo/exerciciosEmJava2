/*Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpa.
 * 
 * Exemplo: entrada 12// sa�da �mpar
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
			System.out.println("�mpar");
		}

		scanner.close();
	}
}


