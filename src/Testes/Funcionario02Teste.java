package Testes;

import Orientacao_a_Objetos.Funcionario;
import br.com.util.Teclado;

public class Funcionario02Teste {
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setNome(Teclado.ReadText("Digite o nome: " ));
		
		String resposta = "s";
		
		while (resposta.equalsIgnoreCase("s")) {
			f1.setNome(Teclado.ReadText("Digite um novo nome: ")); 
			f1.setSalario(Teclado.ReadDouble("Digite o novo Salario: ")); 
			f1.DadosFuncionario();
			resposta = Teclado.ReadText("Deseja sair?[S/N]");
			
			
			
		}

	}

}
