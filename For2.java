package controle;

public class For2 {
	public static void main(String[] args) {
		
		int contador = 20;
		
		for(; contador >= 0 && contador % 2 == 0; contador--) {
			System.out.printf("O contador é : %d\n", contador);
			contador--;
			
		}
		
	}
}
