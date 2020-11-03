package classe;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.1415; // static = pertence a classe;
	
	AreaCirc(double raioInicial) {
		raio =  raioInicial;
	}

	double area() {
		return Math.pow(raio, 2) * PI;
	}
}
