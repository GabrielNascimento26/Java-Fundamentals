package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionario
		
		// Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		// LONG USAR L NO FINAL
		long pontosAcumulados = 3_134_845_223L;
		
		// tipos numericos reais
		// FLOAT USAR F NO FINAL
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipo booleano
		boolean estarDeFerias = false; // true
		
		 // tipo caractere
		char status = 'A'; // ativo
		char sexo = 'M'; // masculino e feminino
		
		// Dias da empresa
		
		System.out.println("O funcionario tem " + anosDeEmpresa * 365 + " dias trabalhos.");
		
		// Número de viagens
		System.out.println("Numero de voos = " + numeroDeVoos / 2);
		
		// Pontos por Real
		
		System.out.println("Pontos por real = " + pontosAcumulados / vendasAcumuladas);
		
		System.out.println("O id " + id + " ganha R$" + salario);
		System.out.println("Está de férias ? " + estarDeFerias);
		System.out.println("Status: " + status);
		
		
		
		
		
	}

}
