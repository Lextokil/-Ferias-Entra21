package Testes;

import Orientacao_a_Objetos.Agencia;
import Orientacao_a_Objetos.Conta;

public class ContaTeste {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		Agencia a1 = new Agencia(3456);
		Agencia a2 = new Agencia(123656);
		
		c1.limite = 1000.0;
		c1.saldo = 500.0;
		c1.numero = 1243;
		c1.agencia = a1;
		c1.Deposito(750.0);
		c1.ConsultaSaldo();
		c1.Saque(350.0);
		c1.ImprimeExtrato();
		
		
		c2.limite = 2000.0;
		c2.saldo = 700.0;
		c2.numero = 2134;
		c2.agencia = a2;
		c2.Deposito(750.0);
		c2.ConsultaSaldo();
		c2.Saque(350.0);
		c2.ImprimeExtrato();
		
		System.out.println(c1.limite + " "+ c1.numero + " "+ c1.saldo+ " "+ c1.agencia.numero);
		System.out.println(c2.limite + " "+ c2.numero + " "+ c2.saldo+ " "+ c2.agencia.numero);
	}

}
