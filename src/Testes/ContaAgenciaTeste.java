package Testes;

import Orientacao_a_Objetos.Agencia;
import Orientacao_a_Objetos.Conta;

public class ContaAgenciaTeste {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Agencia a1 = new Agencia(3456);
		c1.setLimite(1000.0); 
		c1.setSaldo(500.0); 
		c1.setNumero(1243); 
		c1.setAgencia(a1); 
		c1.Deposito(750.0);
		c1.ConsultaSaldo();
		c1.Saque(350.0);
		c1.ImprimeExtrato();

	}

}
