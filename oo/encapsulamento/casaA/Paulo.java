package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	
	//m�todo para acessar Ana;
	void testeAcessos() {
		//System.out.println(esposa.segredo); //n�o consigo acessar: private;
		System.out.println(esposa.facoDentroDeCasa); 
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}
}
