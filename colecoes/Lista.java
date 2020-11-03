package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Amanda");
		lista.add(u1);
		
		lista.add(new Usuario ("Luiz"));
		lista.add(new Usuario ("Gabriella"));
		
		System.out.println(lista.get(2)); //acessar pelo índice.
		
		System.out.println("Tem? " + lista.contains(new Usuario("Angela")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
		
	}
}
