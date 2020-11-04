package oo.heranca.teste;

import oo.heranca.Desafio.Ferrari;
import oo.heranca.Desafio.Ford;

public class CarroTeste {
	
	public static void main(String[] args) {
		//Instância de Ford:
		Ford c1 = new Ford();
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		//Instância de Ferrari:
		Ferrari c2 = new Ferrari(400);
		c2.ligarTurbo();
		c2.ligarAr();
		c2.desligarAr();
		
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
	}
}
