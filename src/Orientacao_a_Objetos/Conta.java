package Orientacao_a_Objetos;



public class Conta {
	public Double saldo;
	public Double limite = 100.0;
	public int numero;
	public Agencia agencia;
	
	public Conta() {
		
	}
	
	public Conta(Double saldo, Double limite, int numero, Agencia agencia) {
		super();
		this.saldo = saldo;
		this.limite = limite;
		this.numero = numero;
		this.agencia = agencia;
	}

	public void Deposito(Double valor) {
		this.saldo += valor;
	}
	
	public void Saque(Double valor) {
		this.saldo -= valor;	
	}
	
	public void ConsultaSaldo() {
		System.out.println("Seu saldo atual �: "+this.saldo);
	}
	
	public void ImprimeExtrato() {
		System.out.println("Numero da conta: "+ this.numero);
		System.out.println("Saldo :"+this.saldo);
		System.out.println("Limite "+ this.limite);
		System.out.println("Agencia: "+ this.agencia.numero);
	}
	
	public void Transfere(Double valorTransferido, Conta cotaDestino) {
		if ((this.saldo - valorTransferido) >= 0) {
			this.saldo -= valorTransferido;
			cotaDestino.saldo += valorTransferido;
		} else {
			System.out.println("Saldo Indispon�vel");
		}
		
		
		
	}
}
