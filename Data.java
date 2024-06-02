package classe;

public class Data {
	// dia mes e ano
	double dia;
	String mes;
	double ano = 1970;
	// definir as caracteristicas

	// o metodo de formatar a data e converter para int
	public String formatarData() {
		int intDia = (int) dia;
		int intAno = (int) ano;
		return String.format("A data formatada é: %d de %s de %d ", intDia, mes, intAno);
}}
