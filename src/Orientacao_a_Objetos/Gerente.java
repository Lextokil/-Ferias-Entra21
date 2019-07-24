package Orientacao_a_Objetos;

public class Gerente extends Funcionario  {
	
	private String usuario;
	private String senha;
	
	
	
	public Gerente(String nome, Double salario, Double valeRef, String usuario, String senha) {
		super(nome, salario, valeRef);
		this.usuario = usuario;
		this.senha = senha;
		// TODO Auto-generated constructor stub
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}






	
	@Override
	public void CalculaBonificacao() {
		this.setBonificacao(this.getSalario()*0.2);
	}
	
	@Override
	public void DadosFuncionario() {
		System.out.println("Nome: "+ this.getNome());
		System.out.println("Salário: "+ this.getSalario());
		System.out.println("Bonificação: "+this.getBonificacao());
		System.out.println("Valor Vale Ref: "+this.getValeRef());
		System.out.println("Usuario: " +this.getUsuario());
		System.out.println("Senha: " + this.getSenha());
	}
	
	
	public void AumentarSalarioFixo() {
		this.setSalario(this.getSalario() +( this.getSalario() * 0.1)); ;
	}
	
	public void AumentarSalarioVariavel(Double porcent) {
		porcent = porcent/100;
		this.setSalario(this.getSalario() +( this.getSalario() * porcent));
	}

	
}
