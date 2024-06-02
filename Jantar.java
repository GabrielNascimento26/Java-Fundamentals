package classe;

public class Jantar {
		public static void main(String[] args) {
			
			Pessoa pessoa = new Pessoa("Gabriel" , 75);	
			Comida arroz = new Comida("Arroz", 0.200);
			
			double pesoGabriel = pessoa.getPeso();
			
			double pesoArroz = arroz.getPeso();
			
			double novoPesoPessoa = pesoGabriel + pesoArroz;
			
			pessoa.setPeso(novoPesoPessoa);
			
			String nomePessoa = pessoa.getNome();
			String nomeComida = arroz.getNome();
			
			System.out.println("Após " + nomePessoa + " comer " + nomeComida + " seu peso agora é :" + novoPesoPessoa);
			
			
			
			
			
			
			
			
			
			
			
			
			
				 }
		
}
