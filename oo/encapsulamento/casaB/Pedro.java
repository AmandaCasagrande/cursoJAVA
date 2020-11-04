package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
		//System.out.println(segredo); //n�o consigo acessar: private;
		//System.out.println(facoDentroDeCasa); //n�o consigo acessar: pacote;
		System.out.println(formaDeFalar); // transmitido por heran�a;
		System.out.println(todosSabem); // consigo acessar: public;
	}
}
