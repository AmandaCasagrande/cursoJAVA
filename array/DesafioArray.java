package array;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas você quer informar? ");
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas]; //array
		
		for (int i = 0; i < qtdNotas; i++) { //percorrer o array
			System.out.println("Digite a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double totalNotas = 0; //somar notas
		for (double nota: notas) { //for each
			totalNotas += nota;
		}
		
		System.out.println("A média é "  +  (totalNotas / qtdNotas)); //calcular e exibir média
		
		entrada.close();
	}
}
