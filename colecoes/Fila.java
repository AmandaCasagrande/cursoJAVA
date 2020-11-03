package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		 Queue<String> fila = new LinkedList<String>();
		 
		 //Offer e Add >> adiciona elementos na fila, a diferene�a � o comportamento quando a fila est� cheia.
		 fila.add("Amanda");
		 fila.offer("Luiz"); //retornar V ou F
		 fila.offer("Pedro");
		 fila.offer("Diego");
		 fila.offer("Rafaela");
		 
		 
		 //Peek e Element >> obt�m o pr�ximo elemento da fila sem remover.
		 System.out.println(fila.peek()); //retorna o primeiro elemento da fila; se fila vazia, retorna nulo.
		 System.out.println(fila.element()); // retorna o primeiro elemento da fila; gera problema se n�o houver ningu�m na fila.
		 
		 //fila.clear()
		 //fila.size()
		 //fila.isEmpty()
		 //fila.contains();
		 
		 System.out.println(fila.poll()); //retorna primeiro elemento da fila j� removendo; Amanda.
		 System.out.println(fila.poll()); // Luiz
		 System.out.println(fila.poll()); // Pedro
		 
		 System.out.println(fila.remove());
		 
		 
		 
		 
	}

}
