package classe.DesafioModuloClasse;

public class Jantar {
	
	public static void main(String[] args) {
	
		Comida c1 = new Comida("Macarrão", 0.300);
		Comida c2 = new Comida("Batata Frita", 0.500);
		Comida c3 = new Comida("Anel de Cebola", 0.300);
		Comida c4 = new Comida("Lasanha", 0.500);
		Comida c5 = new Comida("Torta de limão", 0.200);
		Comida c6 = new Comida("Banoffee", 0.100);

		Pessoa p1 = new Pessoa("Amanda", 53.0);
		Pessoa p2 = new Pessoa("Luiz", 65.0);
		Pessoa p3 = new Pessoa("Angela", 63.0);
		Pessoa p4 = new Pessoa("Getúlio", 75.0);
		
		double pesoFinal = p1.getPesoFinal(c1.peso + c3.peso + c5.peso);
		double pesoFinal1 = p2.getPesoFinal(c2.peso + c6.peso);
		double pesoFinal2 = p3.getPesoFinal(0);
		double pesoFinal3 = p4.getPesoFinal(c1.peso + c4.peso + c5.peso);
		
		System.out.printf("%s \n %.2f kg \n %.2f kg\n\n", p1.nome, p1.peso, pesoFinal);
		System.out.printf("%s \n %.2f kg \n %.2f kg\n\n", p2.nome, p2.peso, pesoFinal1);
		System.out.printf("%s \n %.2f kg \n %.2f kg\n\n", p3.nome, p3.peso, pesoFinal2);
		System.out.printf("%s \n %.2f kg \n %.2f kg\n\n", p4.nome, p4.peso, pesoFinal3);
		
	}
}
