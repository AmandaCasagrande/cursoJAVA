package oo.heranca.Desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual = 60;
	int delta = 5;
	
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}
	
	void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "km/h.";
	}
	
	/*
	velocidade atual 1 atributo
	metodo acelerar, metodo frear if velocidade == 0 não pode frear mais*/
	
}
