package classe;

public class DescontoTeste {
	public static void main(String[] args) {
		
		
	
	
	Desconto desconto = new Desconto("Carteira", 500);
	
	double precoFinal = desconto.preçoComDesconto();
	
	System.out.println(precoFinal);
	
	Desconto desconto2 = new Desconto();
	
	desconto2.nome = "Bolsa";
	desconto2.preco = 1000;
	
	Desconto cigarroDesconto = new Desconto("Marlboro", 6);
	
	double precoFinal3 = cigarroDesconto.preçoComDesconto();
	System.out.println(precoFinal3);
	
	double precoFinal2 = desconto2.preçoComDesconto();
	
	System.out.println(precoFinal2);
	
	
	
	
	
	
}
}
