package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true);	// bolean -> Boolean
		conjunto.add("Teste"); // String e etc..
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é : " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println("Tamanho é : " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// conjunto.addAll(nums); // união entre 2 conjuntos
		conjunto.retainAll(nums); // retém apenas os valores em ambos os conjuntos
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}
}
