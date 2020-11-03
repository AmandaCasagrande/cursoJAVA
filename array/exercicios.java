package array;

import java.util.Arrays;

public class exercicios {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4]; //array
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0; ////percorrer array com for 
		for(int i = 0; i < notasAlunoA.length; i++) {  //lenght = atributo do array (comprimento do array)
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); //última nota do array;
		
		final double notaArmazenada = 5.9;
		double [] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 }; // inicialização de valores direto;
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
