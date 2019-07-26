package Polimorfismo;

public class FuncionarioBanco {
	private String Nome;
	private Double Salario;
	
	
	public FuncionarioBanco(String nome, Double salario) {
		super();
		Nome = nome;
		Salario = salario;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Double getSalario() {
		return Salario;
	}
	public void setSalario(Double salario) {
		Salario = salario;
	}
	
}
