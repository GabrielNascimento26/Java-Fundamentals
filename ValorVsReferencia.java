package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuicao por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data();
		Data d2 = d1; // atribuicao por referencia OBJETO
		
		d1.dia = 31;
		d2.mes = "junho";
		
		System.out.println(d1.formatarData());
		System.out.println(d2.formatarData());
		
	}
}
