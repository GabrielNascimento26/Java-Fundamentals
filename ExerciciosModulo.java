package controle;

import java.util.Scanner;

public class ExerciciosModulo {
		public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numero;
		
		System.out.print("Digite o numero : ");
		numero = entrada.nextDouble();
		
		if(numero % 2 == 0 && numero <= 10) {
			System.out.printf("O numero %.0f é par e menor ou igual a 10", numero);
		} else {
			System.out.println("O número não é par nem menor que 10.");
		}
		
		
		
		
		
		entrada.close();
}
}
