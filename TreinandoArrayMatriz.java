package Ararys;

import java.util.Scanner;

public class TreinandoArrayMatriz {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);

			System.out.println("Quantos alunos sao?");
			int qtdAlunos = entrada.nextInt();
			
			System.out.println("Quantas notas cada aluno tem?");
			int qtdNotasPorAluno = entrada.nextInt();
			
			double[][] notasDaTurma = new double[qtdAlunos][qtdNotasPorAluno];
			
			double total = 0;
			
			for (int a = 0; a < notasDaTurma.length; a++) {
					for (int t = 0; t < notasDaTurma[a].length; t++) {
						System.out.printf("Informe a nota %d do aluno %d: ", t + 1, a + 1);
						notasDaTurma[a][t] = entrada.nextDouble();
						total += notasDaTurma[a][t];
						
					}
			}
			
			
			double media = total / (qtdAlunos * qtdNotasPorAluno);
			System.out.println("A média da turma é: " + media);
			
			
			
			entrada.close();
		}
}
