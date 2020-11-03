package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89); //resultado do construtor;
		
		var p2 = new Produto(); //resultado do construtor;
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto(0.50);
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho =  R$%.2f.", mediaCarrinho);
	}

}
