package oo.heranca.Desafio;

public class Ferrari extends Carro {
	
	Ferrari() {
		super(350);
	}
	
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
	
/*
	void acelerar() {
		velocidadeAtual += 15;
	}
*/
}
	