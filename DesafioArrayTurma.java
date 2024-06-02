package Ararys;

import java.util.Scanner;

public class DesafioArrayTurma {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número de alunos: ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.print("Informe o número de notas por aluno: ");
		int qtdNotas = entrada.nextInt();
		
		
		
		double total = 0;
		double[][] notasDaTurma = new double [qtdAlunos][qtdNotas];
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int t = 0; t < notasDaTurma[a].length; t++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", t + 1, a + 1);
				notasDaTurma[a][t] = entrada.nextDouble();
				total += notasDaTurma[a][t];
				
			}
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("A média da turma é " + media);
		
		
		
		
		
		entrada.close();
	}
}
