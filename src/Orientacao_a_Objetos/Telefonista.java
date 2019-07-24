package Orientacao_a_Objetos;

public class Telefonista extends Funcionario {
	private String codEstaTrab;

	
	public Telefonista(String nome, Double salario, Double valeRef, String estacao) {
		super(nome, salario, valeRef);
		this.codEstaTrab = estacao;
	}

	public String getCodEstaTrab() {
		return codEstaTrab;
	}

	public void setCodEstaTrab(String codEstaTrab) {
		this.codEstaTrab = codEstaTrab;
	}
	
	@Override
	public void DadosFuncionario() {
		System.out.println("Nome: "+ this.getNome());
		System.out.println("Salário: "+ this.getSalario());
		System.out.println("Bonificação: "+this.getBonificacao());
		System.out.println("Valor Vale Ref: "+this.getValeRef());
		System.out.println("Usuario: " +this.getCodEstaTrab());
	}

}
