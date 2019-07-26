package Interfaces;





public  class ContaI extends InterfaceModel  {
	private String Nome;
	private Double saldo;
	public ContaI(String nome, Double saldo) {
		super();
		Nome = nome;
		this.saldo = saldo;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	@Override
	public void deposita(double valor, ContaI conta) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void saca(double valor, ContaI conta) {
		// TODO Auto-generated method stub
		
	}
	
	

	
	
}
