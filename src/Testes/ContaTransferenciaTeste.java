package Testes;

import Orientacao_a_Objetos.Conta;

public class ContaTransferenciaTeste {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		c1.saldo = 1500.0;
		c2.saldo = 2000.0;
		
		c1.Transfere(500.0, c2);
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
	}

}
