/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
 *indicando se os valores lidos são múltiplos entre si.
 *Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
 * 
 * 
 * Exemplo: entrada: 6 24 // saída: São multíplos
 */


package exerciciosJava2;

import java.util.Scanner;

public class MultiplosOuNaoMultiplos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São múltplos");
		}
		else {
			System.out.println("Não são Múltiplos");
		}
		
		scanner.close();
	}
}
