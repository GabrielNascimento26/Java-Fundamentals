package fundamentos;


public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Sla Carolyne";
		var sobrenome = "Mendes do Nascimento";
		var idade = 25;
		var salario = 925.25;
		
		System.out.printf("A funcionaria : %s %s tem %s anos e recebe %.2f"
				, nome, sobrenome, idade, salario);
		
		String frase = String.format("\nA funcionaria : %s %s tem %s anos e recebe %.2f"
				, nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println(frase.toUpperCase());
		System.out.println(frase.toUpperCase().concat("\nBochechudona"));
		
		
		}

}