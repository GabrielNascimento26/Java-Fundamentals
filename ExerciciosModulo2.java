package controle;

import java.util.Scanner;

public class ExerciciosModulo2 {
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			double ano;
			
			System.out.print("Digite o ano para verificar se é bissexto: ");
			ano = entrada.nextDouble();
			
			boolean eBissexto = (ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 ==0));
			
			if(eBissexto) {
				System.out.printf("O ano %.0f é bissexto", ano);
			} else {
				System.out.printf("O ano %.0f não é bissexto", ano);
				
			}
			
			
			
			entrada.close();
		}
}
