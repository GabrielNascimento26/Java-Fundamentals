package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		double fahrenheit = 40;
		double ajuste = 32;

		double fator = 5/9.0;
		
		double celsius = (fahrenheit - ajuste) * fator;
		
		System.out.println(celsius);
		
		
}

}
