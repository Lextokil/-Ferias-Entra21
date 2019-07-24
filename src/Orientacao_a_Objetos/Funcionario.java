package Orientacao_a_Objetos;

public class Funcionario {
	private String nome;
	private Double salario = 1000.0;
	private Double valeRef;
	private Double bonificacao;
	
	

	public Funcionario() {
		
	}
	
	public Funcionario(String nome, Double salario, Double valeRef) {
		this.nome = nome;
		this.salario = salario;
		this.valeRef = valeRef;
	}
	
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
		System.out.println("Bonificação: "+this.bonificacao);
		System.out.println("Valor Vale Ref: "+this.valeRef);
	}
	
	public Double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(Double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public void ReajusteValeRef(Double porcent) {
		porcent = porcent/100;
		this.valeRef += this.valeRef*porcent;
	}
	
	public void CalculaBonificacao() {
		bonificacao = this.salario*0.1;
	}

	
	
}
