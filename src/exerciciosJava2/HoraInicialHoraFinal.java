/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que
 * o mesmo pode come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
 * 
 * Exemplo: entrada: 16 2 // sa�da : ojogo durou 10 horas.
 */


package exerciciosJava2;

import java.util.Scanner;

public class HoraInicialHoraFinal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int horaInicial = scanner.nextInt();
		int horaFinal = scanner.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou " + duracao + " horas");
		
		scanner.close();
	}
}