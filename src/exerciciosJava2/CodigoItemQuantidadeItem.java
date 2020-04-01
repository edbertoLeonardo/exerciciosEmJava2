/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
 * A seguir, calcule e mostre o valor da conta a pagar. 
 * (não copiei a tabela)preços no if else
 * 
 * Exemplo: entrada 3 2// saida Total: R$ 10.00
 */

package exerciciosJava2;

import java.util.Scanner;

public class CodigoItemQuantidadeItem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int codigo = scanner.nextInt();
		int quantidade = scanner.nextInt();

		double total;
		{
			if (codigo == 1) {
				total = quantidade * 4.0;
			} else if (codigo == 2) {
				total = quantidade * 4.5;
			} else if (codigo == 3) {
				total = quantidade * 5.0;
			} else if (codigo == 4) {
				total = quantidade * 2.0;
			} else {
				total = quantidade * 1.5;
			}

			System.out.printf("Total: R$ %.2f%n", total);

			scanner.close();
		}
	}
}