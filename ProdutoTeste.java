package classe;

public class ProdutoTeste {
		
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");
		Produto p2 = new Produto("Caneta");
		// p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		// p2.nome = "Caneta";
		p2.preco = 5.00;
		p2.desconto = 0.10;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("A média do carrinho é : R$%.2f", mediaCarrinho);
		
		
		
		
		
		
		
		
		
		
	}
}
