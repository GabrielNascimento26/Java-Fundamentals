package controle;

import java.util.Scanner;

public class DesafioModuloPrimo {

    public static boolean ePrimo(int primo) {
        if (primo <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(primo); i++) {
            if (primo % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primo;
        
        System.out.println("Digite o numero para saber se é primo ou não: ");
        primo = entrada.nextInt();
        entrada.close();
        
        if (ePrimo(primo)) {
            System.out.println(primo + " é primo.");
        } else {
            System.out.println(primo + " não é primo.");
        }
    }
}
