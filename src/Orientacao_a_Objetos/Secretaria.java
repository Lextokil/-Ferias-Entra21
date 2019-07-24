package Orientacao_a_Objetos;

public class Secretaria extends Funcionario
{
	
	private int nrRamal;
	
	

	

	

	public Secretaria(String nome, Double salario, Double valeRef, int ramal) {
		super(nome, salario, valeRef);
		this.nrRamal = ramal;
		// TODO Auto-generated constructor stub
	}

	public int getNrRamal() {
		return nrRamal;
	}

	public void setNrRamal(int nrRamal) {
		this.nrRamal = nrRamal;
	}
	
	@Override
	public void DadosFuncionario() {
		System.out.println("Nome: "+ this.getNome());
		System.out.println("Salário: "+ this.getSalario());
		System.out.println("Bonificação: "+this.getBonificacao());
		System.out.println("Valor Vale Ref: "+this.getValeRef());
		System.out.println("Usuario: " +this.getNrRamal());
	}

}
