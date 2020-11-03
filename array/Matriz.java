package array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.print("Quantos notas por aluno? ");
		int qtdNotas = entrada.nextInt();
		
		double[][] notasTurma = new double [qtdAlunos][qtdNotas];
		
		double total = 0;
		for (int a = 0; a < notasTurma.length; a++) {
			for (int b = 0; b < notasTurma[a].length; b++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", (b + 1), (a + 1));
				
				notasTurma[a][b] = entrada.nextDouble();
				total += notasTurma[a][b];
			}
		}
		
		double media = (total / (qtdAlunos * qtdNotas));
		System.out.println("Média da turma é "+ media);
		
		for (double[] notasAluno: notasTurma){
			System.out.println(Arrays.toString(notasAluno));
		}
		
		entrada.close();
	}
}
