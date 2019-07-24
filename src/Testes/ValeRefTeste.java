package Testes;

import Orientacao_a_Objetos.Funcionario;

public class ValeRefTeste {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();

		f1.setNome("Zezin");
		f1.setSalario(800.0); 
		f1.setValeRef(30.0);
		f1.ReajusteValeRef(10.0);
		f1.DadosFuncionario();

	}

}
