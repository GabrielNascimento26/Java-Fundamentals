package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario1, salario2, salario3;

        System.out.println("Digite o primeiro salário:");
        salario1 = lerSalario(scanner);

        System.out.println("Digite o segundo salário:");
        salario2 = lerSalario(scanner);

        System.out.println("Digite o terceiro salário:");
        salario3 = lerSalario(scanner);

        System.out.printf("Os salários digitados foram: %.2f, %.2f e %.2f%n",
        		salario1, salario2, salario3);
        
        double media = (salario1 + salario2 + salario3) / 3;
        
        System.out.printf("A média salarial é de: %.2f%n", media);

        
        
        scanner.close();
    }

    private static double lerSalario(Scanner scanner) {
        String entrada = scanner.next();
        // Substituir vírgulas por pontos
        entrada = entrada.replace(',', '.');
        // Converter para double
        return Double.parseDouble(entrada);
    }
}
