package controle;

import java.util.Scanner;



public class ExerciciosModulo3 {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			double nota;
			double soma = 0;
			int contador = 0;
			
			while (contador < 2) {
			    System.out.print("Informe as notas do pequeno jumento: ");
			    nota = entrada.nextDouble();

			    if (contador >= 2) {
			        break;
			    }

			    soma += nota;
			    contador++;
			}

			entrada.close();
			double media = soma / contador;
			double reprovado = 7 - media;
			if(contador >= 2 && media >= 7) {
				System.out.println("Aluno aprovado");
			} else {
				System.out.printf("Faltou %.0f para passar de ano", reprovado);
			}
			
			
			}
		}

