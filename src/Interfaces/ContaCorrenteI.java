package Interfaces;

public class ContaCorrenteI extends ContaI {

	public ContaCorrenteI(String nome, Double saldo) {
		super(nome, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposita(double valor, ContaI conta) {
		conta.setSaldo(conta.getSaldo() + valor);
	}
	
	@Override
	public void saca(double valor, ContaI conta) {
		conta.setSaldo(conta.getSaldo() - valor);
	}
	

}
