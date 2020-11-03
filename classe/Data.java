package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() { //construtor padr�o
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this (1,1, 1970);
	}
	
	Data(int dia, int mes, int ano){ //construtor
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String dataFormatada() {
		final String formato = "%d/%d/%d"; //vari�vel local
		return String.format(formato, dia, mes, ano); //vari�vel local
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.dataFormatada());
	}
}
