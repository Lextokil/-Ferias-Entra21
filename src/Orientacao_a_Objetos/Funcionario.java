package Orientacao_a_Objetos;

public class Funcionario {
	private String nome;
	private Double salario = 1000.0;
	private Double valeRef;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getValeRef() {
		return valeRef;
	}

	public void setValeRef(Double valeRef) {
		this.valeRef = valeRef;
	}

	public void AumentarSalario(Double valor) {
		this.salario += valor;
	}
	
	public void DadosFuncionario() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Salário: "+ this.salario);
		System.out.println("Valor Vale Ref: "+this.valeRef);
	}
	
	public void ReajusteValeRef(Double porcent) {
		porcent = porcent/100;
		this.valeRef += this.valeRef*porcent;
	}
	
}
