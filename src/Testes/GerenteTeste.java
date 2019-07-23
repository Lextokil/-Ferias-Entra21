package Testes;

import Orientacao_a_Objetos.Gerente;

public class GerenteTeste {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente(1000.0);
		
		System.out.println(g1.salario);
		g1.AumentarSalarioFixo();
		System.out.println(g1.salario);
		
		g1.AumentarSalarioVariavel(20.0);
		
		System.out.println(g1.salario);
	}

}
