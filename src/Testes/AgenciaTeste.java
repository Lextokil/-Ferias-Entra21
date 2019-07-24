package Testes;

import Orientacao_a_Objetos.Agencia;

public class AgenciaTeste {

	public static void main(String[] args) {
		Agencia a1 = new Agencia();
		Agencia a2 = new Agencia();
		a1.setNumero(6789); 
		a2.setNumero(9876); 
		
		System.out.println(a1.getNumero());
		System.out.println(a2.getNumero());

	}

}
