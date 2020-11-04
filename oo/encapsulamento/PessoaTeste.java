package oo.encapsulamento;

public class PessoaTeste {
	//Getters e Setters
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro", "Amoedo", -45);
		p1.setIdade(230); //alterar valor da variável
		
		System.out.println(p1.getIdade()); //acesso do valor da variável
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());
	}
}
