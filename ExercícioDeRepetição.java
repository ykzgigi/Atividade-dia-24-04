package AtividadeLPAdia24;

import java.util.Scanner;

public class ExercícioDeRepetição {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int espaco ;
		int i=0;

		System.out.print ("Informe o numero final desejado: ");

		espaco = ler.nextInt();

		System.out.print ("Numeros impares do numero informado" + espaco+ ": ");

		while (i <= espaco) {

			if (i% 2 != 0) {

				System.out.println(i+ " ");

			}

			i++;

			ler.close();

		}

	}

}
