package oo.encapsulamento.casaB;
import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	void testeAcessos() {
		Ana sogra = new Ana();
		//System.out.println(sogra.segredo); //n�o consigo acessar: private;
		//System.out.println(sogra.facoDentroDeCasa); //n�o consigo acessar: pacote;
		//System.out.println(sogra.formaDeFalar); // n�o consigo acessar: sem heran�a;
		System.out.println(sogra.todosSabem); // consigo acessar: public;
	}
}
