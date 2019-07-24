package Orientacao_a_Objetos;

public class Conta {
	private Double saldo;
	private Double limite = 100.0;
	private int numero;
	private Agencia agencia;
	private static int contator;

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public static int getContator() {
		return contator;
	}

	public static void setContator(int contator) {
		Conta.contator = contator;
	}

	public Conta() {
		Conta.contator++;
		this.numero = Conta.contator;
	}

	public Conta(Double saldo, Double limite, Agencia agencia) {
		super();
		this.saldo = saldo;
		this.limite = limite;

		this.agencia = agencia;
		Conta.contator++;
		this.numero = Conta.contator;
	}

	public void Deposito(Double valor) {
		this.saldo += valor;
	}

	public void Saque(Double valor) {
		this.saldo -= valor;
	}

	public void ConsultaSaldo() {
		System.out.println("Seu saldo atual é: " + this.saldo);
	}

	public void ImprimeExtrato() {
		System.out.println("Numero da conta: " + this.numero);
		System.out.println("Saldo :" + this.saldo);
		System.out.println("Limite " + this.limite);
		System.out.println("Agencia: " + this.agencia.getNumero());
	}

	public void Transfere(Double valorTransferido, Conta cotaDestino) {
		if ((this.saldo - valorTransferido) >= 0) {
			this.saldo -= valorTransferido;
			cotaDestino.saldo += valorTransferido;
		} else {
			System.out.println("Saldo Indisponível");
		}
	}

	public void ZerarContador() {
		System.out.println(Conta.contator);
		Conta.contator = 0;
	}
}
