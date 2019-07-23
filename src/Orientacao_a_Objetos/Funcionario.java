package Orientacao_a_Objetos;

public class Funcionario {
	public String nome;
	public Double salario = 1000.0;
	
	public void AumentarSalario(Double valor) {
		this.salario += valor;
	}
	
	public void DadosFuncionario() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Salário: "+ this.salario);
	}
}
