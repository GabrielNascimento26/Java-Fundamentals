package Colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario user = new Usuario("Gabriel");
		lista.add(user);
		lista.add(new Usuario("João"));
		lista.add(new Usuario("Marcelo"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manuela"));
		
		System.out.println(lista.get(3)); // acessar pelo índice
		lista.remove(1);
		lista.remove(new Usuario("Manu"));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		for(Usuario u1: lista) {
			System.out.println(u1);
		}
	}
}
