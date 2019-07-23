package Testes;

import Orientacao_a_Objetos.Agencia;
import Orientacao_a_Objetos.Conta;

public class MetodosContaTeste {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Agencia a1 = new Agencia(3456);
		c1.limite = 1000.0;
		c1.saldo = 500.0;
		c1.numero = 1243;
		c1.agencia = a1;
		c1.Deposito(750.0);
		c1.ConsultaSaldo();
		c1.Saque(350.0);
		c1.ImprimeExtrato();

	}

}
