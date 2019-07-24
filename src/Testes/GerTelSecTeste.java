package Testes;

import Orientacao_a_Objetos.Funcionario;
import Orientacao_a_Objetos.Gerente;
import Orientacao_a_Objetos.Secretaria;
import Orientacao_a_Objetos.Telefonista;

public class GerTelSecTeste {

	public static void main(String[] args) {
		Funcionario g1 =  new Gerente("Xico", 10000.0, 25.0, "usuario", "senha");
		Funcionario s1 = new Secretaria("Juju", 900.0, 23.5, 69);
		Funcionario t1 = new Telefonista("Xita", 2000.0, 35.0, "XXteixon");
		
		g1.DadosFuncionario();
		s1.DadosFuncionario();
		t1.DadosFuncionario();
	}

}
