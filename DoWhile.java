package controle;

import java.util.Scanner;



public class DoWhile {
	public static void main(String[] args) {
			
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		
		
		do {
			System.out.println("Bochechuda da minha "
					+ "viducha...");
			System.out.println("Eu te amo");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("tambem te amo"));
		
		System.out.println("Own <3");
		
		
		
		
		entrada.close();
		
	}	
}
