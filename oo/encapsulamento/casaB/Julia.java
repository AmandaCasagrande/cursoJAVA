package oo.encapsulamento.casaB;
import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	void testeAcessos() {
		Ana sogra = new Ana();
		//System.out.println(sogra.segredo); //não consigo acessar: private;
		//System.out.println(sogra.facoDentroDeCasa); //não consigo acessar: pacote;
		//System.out.println(sogra.formaDeFalar); // não consigo acessar: sem herança;
		System.out.println(sogra.todosSabem); // consigo acessar: public;
	}
}
