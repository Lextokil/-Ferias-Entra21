package Testes;

import Orientacao_a_Objetos.Conta;

public class ContaTeste {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		c1.limite = 1000.0;
		c1.saldo = 500.0;
		c1.numero = 1243;
		
		c2.limite = 2000.0;
		c2.saldo = 700.0;
		c2.numero = 2134;
		
		System.out.println(c1.limite + " "+ c1.numero + " "+ c1.saldo);
		System.out.println(c2.limite + " "+ c2.numero + " "+ c2.saldo);
	}

}
