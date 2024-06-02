package classe;

public class Desconto {
	
	String nome;
	double preco;
	static final double descontoNormal = 0.25;
	static final double descontoNatal = 0.50;
	boolean ehNatal = true;
	
	
	
	
	
	
	double preçoComDesconto() {
		if(ehNatal) {
			return preco * (1 - descontoNatal);
		} else {
			return preco * (1 - descontoNormal);
		}
	}
	
	Desconto() {
		
	}
	
	Desconto(String nomeNovo, double precoNovo) {
		nome = nomeNovo;
		preco = precoNovo;
		
	}
	
	
	
}
