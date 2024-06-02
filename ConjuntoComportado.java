package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		SortedSet<String> listaAprovado = new TreeSet<>();
		listaAprovado.add("Ana");
		listaAprovado.add("Gabriel");
		listaAprovado.add("Luiz");
		listaAprovado.add("Carlos");
		listaAprovado.add("Pedro");
		listaAprovado.add("Joao");
		
		for(String candidatos: listaAprovado) {
			System.out.println(candidatos);
		}
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(18);
		nums.add(29);
		nums.add(14);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
	
}
