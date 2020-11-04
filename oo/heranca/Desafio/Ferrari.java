package oo.heranca.Desafio;

public class Ferrari extends Carro {
	
	public Ferrari() {
		this(350);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
	
/*
	void acelerar() {
		velocidadeAtual += 15;
	}
*/
}
	
