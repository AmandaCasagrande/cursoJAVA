package classe.DesafioModuloClasse;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){ 
		this.nome = nome;
		this.peso = peso;
	}

	public double getPesoFinal(double pesoComida) {	
		return peso + pesoComida;
	}
	
	

}
