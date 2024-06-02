package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a media: ");
		double media = entrada.nextDouble();

		if (media >= 7)
			// NAO USAR PONTO E VIRGULA EM IF
			;
		{
			System.out.println("Aprovado, parabens");
		}

		entrada.close();
	}
}
