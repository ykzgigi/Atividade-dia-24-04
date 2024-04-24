package AtividadeLPAdia24;

import java.util.Scanner;

public class ExercícioDeRepetição02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int valor, soma = 0, media;
		int i = 1;


		while (i <= 5) {
			System.out.println("Informe um número: ");
			valor = ler.nextInt();
			soma = soma+valor;
			System.out.println("O valor da soma é: " + soma);
			i++;
		}

		media = soma/5;

		System.out.println( "o valor da media " + media);

	}
}
