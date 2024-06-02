package fundamentos;

import java.util.Scanner;

public class ExercicioTemperatura {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em fahrenheit para converter para Celsius");
		double fahrenheit = entrada.nextDouble();
		
		int ajuste = 32;
		double fator = 5/9.0;
		
		double celsius = (fahrenheit - ajuste) * fator;
		
		System.out.printf("%.0f em celsius é: %.2fº", fahrenheit, celsius);
		
		
		
		entrada.close();
		
		
		
		
	}
}
