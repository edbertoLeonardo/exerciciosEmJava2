/*Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
 *indicando se os valores lidos s�o m�ltiplos entre si.
 *Aten��o: os n�meros devem poder ser digitados em ordem crescente ou decrescente.
 * 
 * 
 * Exemplo: entrada: 6 24 // sa�da: S�o mult�plos
 */


package exerciciosJava2;

import java.util.Scanner;

public class MultiplosOuNaoMultiplos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("S�o m�ltplos");
		}
		else {
			System.out.println("N�o s�o M�ltiplos");
		}
		
		scanner.close();
	}
}
