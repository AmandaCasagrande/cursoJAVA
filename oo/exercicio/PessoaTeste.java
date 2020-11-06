package oo.exercicio;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Amanda", 24, "999966666");
		p1.setIdade(p1.getIdade() + 1);
		p1.setIdade(p1.getIdade() + 1);
		p1.setIdade(p1.getIdade() + 1);
		p1.setIdade(p1.getIdade() + 1);
		
		System.out.println("NOME: " + p1.getNome());
		System.out.println("IDADE: " + p1.getIdade());
		System.out.println("TELEFONE: " + p1.getTelefone());
	}
}
