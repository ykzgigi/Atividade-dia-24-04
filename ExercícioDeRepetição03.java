package AtividadeLPAdia24;

import java.util.Scanner;

public class ExercícioDeRepetição03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int impar = 0, par = 0, num;
		int i = 1;
		
		while (i <= 10) {
			System.out.print("Informe o " + i + "° número: ");
			num = ler.nextInt();
			if (num % 2 ==0)
				par = par + 1 ; //par += 1
			else
				impar = impar +1; // impar += 1
			i++;
		}
		System.out.println( "Qtde de par: "+par );
		System.out.println( "Qtde de impar: "+impar );
	}

}
