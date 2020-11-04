package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	
	//método para acessar Ana;
	void testeAcessos() {
		//System.out.println(esposa.segredo); //não consigo acessar: private;
		System.out.println(esposa.facoDentroDeCasa); 
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}
}
