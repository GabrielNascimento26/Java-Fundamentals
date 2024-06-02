package controle;

import java.util.Scanner;

public class DesafioWhile {
		public static void main(String[] args) {
			
			
			Scanner entrada = new Scanner(System.in);
			
			
		
			String frase = "";
			
			while(!frase.equals("sair")) {
				System.out.print("Você digitou : ");
				frase = entrada.nextLine();
				
			}

				entrada.close();
			
			
			
			
			
			
			
			
		}
}
