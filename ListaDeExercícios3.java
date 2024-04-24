package AtividadeLPAdia24;

import java.util.Scanner;

public class ListaDeExercícios3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		

		int valor, soma = 0, media,resultado;

		for (int i=0; i <= 4; i++) {

			System.out.print("Informe um número: ");

			valor= ler.nextInt();

			soma = soma+valor;

			System.out.println( "o valor da soma " + soma);

		}

		media = soma/5;

		System.out.println( "o valor da media " + media);

	}
	
}





