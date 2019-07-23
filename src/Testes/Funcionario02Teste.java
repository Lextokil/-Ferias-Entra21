package Testes;

import Orientacao_a_Objetos.Funcionario;
import br.com.util.Teclado;

public class Funcionario02Teste {
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.nome = Teclado.ReadText("Digite o nome: " );
		
		String resposta = "s";
		
		while (resposta.equalsIgnoreCase("s")) {
			f1.nome = Teclado.ReadText("Digite um novo nome: ");
			f1.salario = Teclado.ReadDouble("Digite o novo Salario: ");
			f1.DadosFuncionario();
			resposta = Teclado.ReadText("Degeja continuar?[S/N]");
			
			
			
		}

	}

}
