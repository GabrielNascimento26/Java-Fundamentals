package Ararys;

import java.util.Scanner;

public class TreinandoDesafioArray {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Quantas notas gostaria de inserir?");
			int quantidade = entrada.nextInt();
			
			double[] notas = new double[quantidade];
			
			double total = 0;
			
			for (int i = 0; i < notas.length; i++) {
				System.out.println("Insira a nota " + (i + 1) + ":");
				notas[i] = entrada.nextDouble();
				total += notas[i];
			}
			
			System.out.println("As notas inseridas foram: ");
			for(double nota: notas) {
				System.out.println(nota);
			}

			double media = total / notas.length;
			
			System.out.println("A media das notas é: " + media);
			
			if(media >= 7) {
				System.out.println("Aprovado");
			} else if (media >= 5) {
				System.out.println("Em recuperação");
			} else {
				System.out.println("Reprovado");
			}
			
			
			
			entrada.close();
		}
	}

