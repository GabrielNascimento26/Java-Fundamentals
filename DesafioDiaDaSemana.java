package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana :");
		String dia = entrada.nextLine();
		
		if(dia.equals("segunda")) {
			System.out.println("Segunda é o primeiro dia da semana");
		} else if(dia.equals("terça")){
			System.out.println("Terça é o segundo dia da semana");
		} else if(dia.equals("quarta")){
			System.out.println("Quarta é o terceiro dia da semana");
		} else if(dia.equals("quinta")){
			System.out.println("Quinta é o quarto dia da semana");
		} else if(dia.equals("sexta")){
			System.out.println("Sexta é o quinto dia da semana");
		} else if(dia.equals("sábado")){
			System.out.println("Sábado é o sexto dia da semana");
		} else if(dia.equals("domingo")){
			System.out.println("Domingo é o último dia da semana");
		}
		  else {
			 System.out.println("Dia inválido");
		 }
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}
}
