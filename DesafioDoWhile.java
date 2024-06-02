package controle;

import java.util.Scanner;

public class DesafioDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        double soma = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite sua nota, pequeno jumento (ou -1 para sair): ");
            nota = entrada.nextDouble();
            
            if (nota == -1) {
                break;
            }
            
            soma += nota;
            contador++;
        }

        entrada.close();
        
        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Você digitou " + contador + " notas.");
            System.out.println("A média das notas digitadas é: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }
    }
}
