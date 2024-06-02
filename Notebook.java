package classe;

public class Notebook {
	int data = 01;
	int mes = 01;
	int ano = 1970;
	
	
	Notebook() {
		
	}
	
	Notebook(int dataInicial, int mesInicial,
			int anoInicial) {
		data = dataInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	public String toString() {
		return "A data é: " + data + " de " + mes + " de " + ano;
	}
	
	
}
