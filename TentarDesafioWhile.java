package controle;

import java.util.Scanner;

public class TentarDesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota;
		double soma = 0;
		int contador = 0;
		
		while(true) {
			System.out.print("Digite a nota, pequeno jumento");
			nota = entrada.nextDouble();
			
			if(nota == -1) {
				break;
			}
			soma += nota;
			contador++;
		}
		if(contador > 0) {
			double media = soma / contador;
			System.out.println("A qntd de notas é : " + contador);
			System.out.println("A média é : " + media);
		}
		
		
		
		
		entrada.close();
	}
}

