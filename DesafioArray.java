package Ararys;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas gostaria de inserir? ");
		int quantidade = entrada.nextInt();

		
		double[] notas = new double[quantidade];
		
		double total = 0;
		for (int j = 0; j < notas.length; j++) {
			System.out.println("Insira a nota " + (j + 1) + ": ");
			notas[j]= entrada.nextDouble(); 
			total += notas[j];
		}
		
		System.out.println("Notas inseridas: ");
		for(double nota: notas) {
			System.out.println(nota);
		}
		
		double media = total / notas.length;
		System.out.println("A média foi: " + media);
		
		
		
		entrada.close();
	}
}
