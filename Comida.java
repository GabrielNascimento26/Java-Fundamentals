package classe;

public class Comida {
    private String nome;
    private double peso;

    // Construtor
    public Comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    // Método getNome
    public String getNome() {
        return nome;
    }
    
    public double getPeso() {
    	return peso;
    }

    // Outros métodos (getPeso, etc.)
}
