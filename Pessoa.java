package classe;

public class Pessoa {
		
	String nomePessoa;
	double pesoPessoa;
	
	public Pessoa(String nomePessoa, double pesoPessoa) {
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	
	public String getNome() {
		return nomePessoa;
	
	}

		
	public double getPeso() {
		return pesoPessoa;
	}
	
	public void setPeso(double pesoPessoa) {
        this.pesoPessoa = pesoPessoa;
	}
	}
	
	
	

