package fundamentos;

import java.util.Scanner;

public class DesafioTemperaturaDenovo {
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite a temperatuar em Celsius para converter em Fahrenheit");
			double celsius = entrada.nextDouble();
			
			double fator = 1.8;
			double ajuste = 32;
			
			double fahrenheit = (celsius * fator) + ajuste;
			
			System.out.printf("%.0f em fahrenheit é : %.2f", celsius, fahrenheit);
			
			
			
			
			
			
			
			entrada.close();
			
			
			
		}
}
