package classe;

public class NotebookTeste {
	
	public static void main(String[] args) {
		
		Notebook primeiro = new Notebook();
		Notebook segundo = new Notebook(05, 05, 2025);
		
		
		// System.out.println(primeiro.data);
		
		String dataFormatada = primeiro.toString();
		String dataFormatada2 = segundo.toString();
		// imprimir o metodo
		System.out.println(dataFormatada);
		System.out.println(dataFormatada2);
		
		
		
		
		
}
	
	
}
