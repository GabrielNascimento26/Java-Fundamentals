package classe;

public class DataTeste {
	public static void main(String[] args) {
		// instanciar duas datas
		Data data = new Data();
		// instanciar a nova data
		
		// definir a data
		data.dia = 01;
		data.mes = "Janeiro";
		data.ano = 2024;
		// armazenar a data formatada numa variavel
		String dataFormatada = data.formatarData();
		// imprimir o metodo
		System.out.println(dataFormatada);
		
	}
	
	
}
