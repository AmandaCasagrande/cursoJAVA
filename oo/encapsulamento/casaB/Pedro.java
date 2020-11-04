package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
		//System.out.println(segredo); //não consigo acessar: private;
		//System.out.println(facoDentroDeCasa); //não consigo acessar: pacote;
		System.out.println(formaDeFalar); // transmitido por herança;
		System.out.println(todosSabem); // consigo acessar: public;
	}
}
