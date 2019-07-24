package Testes;

import Orientacao_a_Objetos.Gerente;

public class GerenteTeste {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("xico", 1000.0, 34.0, "usuario", "senha");
		
		System.out.println(g1.getSalario());
		g1.AumentarSalarioFixo();
		System.out.println(g1.getSalario());
		
		g1.AumentarSalarioVariavel(20.0);
		
		System.out.println(g1.getSalario());
	}

}
