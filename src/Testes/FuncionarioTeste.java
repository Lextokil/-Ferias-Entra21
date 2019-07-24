package Testes;

import Orientacao_a_Objetos.Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.setNome("Zezin");
		f1.setSalario(800.0); 
		f1.DadosFuncionario();
		
		f2.setNome("Chico");
		f2.setSalario(500.0); 
		f2.DadosFuncionario();
		
		System.out.println(f1.getNome() + " "+ f1.getSalario());
		System.out.println(f2.getNome() + " "+ f2.getSalario());
		

	}

}
