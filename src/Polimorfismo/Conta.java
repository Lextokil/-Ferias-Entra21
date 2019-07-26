package Polimorfismo;

public class Conta {
	private String nome;
	private int num;
	private Double Saldo;
	private Double limite;
	
	
	public Conta(String nome, int num, Double saldo, Double limite) {
		super();
		this.nome = nome;
		this.num = num;
		Saldo = saldo;
		this.limite = limite;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Double getSaldo() {
		return Saldo;
	}
	public void setSaldo(Double saldo) {
		Saldo = saldo;
	}
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}

}
