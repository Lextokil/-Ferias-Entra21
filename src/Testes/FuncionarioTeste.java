package Testes;

import Orientacao_a_Objetos.Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.nome = "Zezin";
		f1.salario = 800.0;
		f1.AumentarSalario(350.0);
		f1.DadosFuncionario();
		
		f2.nome =  "Maxsuel";
		f2.salario = 4000.0;
		f2.AumentarSalario(350.0);
		f2.DadosFuncionario();
		
		System.out.println(f1.nome + " "+ f1.salario);
		System.out.println(f2.nome + " "+ f2.salario);
		

	}

}
