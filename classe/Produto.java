package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25; // 0 e 1;
	
	Produto(){
		
	}
	
	Produto(String nomeInicial, double precoInicial){ //construtor
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
		
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
	}
}
