package fundamentos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fahrenheit = 80;
		int ajuste = 32;
		
		double fator = 5/9.0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Olá bochechuda da minha vida. Digite um numero para calcular a temperatura em graus Celsius");
		double celsius = scanner.nextDouble();
		scanner.close();
		
		System.out.println("O valor inserido em graus Celsius equivale a " + (celsius - ajuste) * fator );
		
		
		
	}

}
