package Testes;

import Orientacao_a_Objetos.Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Zezin", 800.0, 25.0);
		Funcionario f2 = new Funcionario("Chico", 500.0, 30.0);
		
		
		
		f1.CalculaBonificacao();
		f1.DadosFuncionario(); 
		
		f2.CalculaBonificacao();
		f2.DadosFuncionario();
		
		
		

	}

}
