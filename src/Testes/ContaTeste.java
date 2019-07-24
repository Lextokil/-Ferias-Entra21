package Testes;

import Orientacao_a_Objetos.Agencia;
import Orientacao_a_Objetos.Conta;

public class ContaTeste {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		Agencia a1 = new Agencia(3456);
		Agencia a2 = new Agencia(123656);
		
		c1.setLimite(1000.0); 
		c1.setSaldo(500.0); 
		c1.setNumero(1243);
		c1.setAgencia(a1); 
		c1.Deposito(750.0);
		c1.ConsultaSaldo();
		c1.Saque(350.0);
		c1.ImprimeExtrato();
		
		
		c2.setLimite(2000.0); 
		c2.setSaldo(800.0); 
		c2.setNumero(1243);
		c2.setAgencia(a2); 
		c2.Deposito(750.0);
		c2.ConsultaSaldo();
		c2.Saque(130.0);
		c2.ImprimeExtrato();
		
		System.out.println(c1.getLimite() + " "+ c1.getNumero() + " "+ c1.getSaldo()+ " "+ c1.getAgencia().getNumero());
		System.out.println(c2.getLimite() + " "+ c2.getNumero() + " "+ c2.getSaldo()+ " "+ c2.getAgencia().getNumero());
	}

}
