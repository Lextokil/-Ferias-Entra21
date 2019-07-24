package Testes;

import Orientacao_a_Objetos.Conta;

public class ContaTransferenciaTeste {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		c1.setSaldo(1500.0); 
		c2.setSaldo(2000.0); 
		
		c1.Transfere(500.0, c2);
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
	}

}
