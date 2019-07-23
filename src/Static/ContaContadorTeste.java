package Static;

import Orientacao_a_Objetos.Conta;

public class ContaContadorTeste {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		System.out.println(Conta.contator);
		System.out.println(c1.numero);
		
		
		Conta c2 = new Conta();
		System.out.println(Conta.contator);
		System.out.println(c2.numero);
		
	

	}

}
