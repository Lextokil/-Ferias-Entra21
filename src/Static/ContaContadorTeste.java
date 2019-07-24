package Static;

import Orientacao_a_Objetos.Conta;

public class ContaContadorTeste {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		System.out.println(Conta.getContator());
		System.out.println(c1.getNumero());
		
		
		Conta c2 = new Conta();
		System.out.println(Conta.getContator());
		System.out.println(c2.getNumero());
		c1.ZerarContador();
		System.out.println(Conta.getContator());
		
		
		
	

	}

}
