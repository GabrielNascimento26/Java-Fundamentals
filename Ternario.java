package fundamentos;

public class Ternario {
	public static void main(String[] args) {
		
		
	double media = 4.9;
	String recuperacao = media >= 5.0 ? "em recuperação" : "reprovado";
	String resultado = media >= 7.0 ? "Aprovado" : recuperacao;
	
	// System.out.println("O aluno está: " + resultado);
	
	boolean temBochecha = true;
	boolean chamaVitoria = false;
	boolean chamaCarol = false;
	String amar = temBochecha  ? " Se tem bochechonas e se chama Sla Carolyne Mendes do Nascimento, eu amo." : "Sai daqui, bochechudona impostora";
	
	// System.out.println("Tem bochechonas ?" + amar);
	
	if(temBochecha && chamaCarol) {
		System.out.println("Se tem bochechonas e se chama Sla Carolyne Mendes do Nascimento, eu amo.");
	} else if(temBochecha && chamaVitoria) {
		System.out.println("é uma bulldog impostora");
	} else {
		System.out.println("É só uma bochechuda qualquer, nao ligo");
		
	}
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//System.out.println("O que vamos fazer hoje?");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
