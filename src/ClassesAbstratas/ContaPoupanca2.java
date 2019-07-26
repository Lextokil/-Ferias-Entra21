
package ClassesAbstratas;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class ContaPoupanca2 extends ContaAbstrata {
	private int numero;
	
	private String data;
	
	public ContaPoupanca2(String titular, Double saldo, Double limite, int numero) {
		super(titular, saldo, limite);
		this.numero = numero;
		// TODO Auto-generated constructor stub
	}
	public String getDataAtual() {        
	    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
	    Date dataAtual = new Date(System.currentTimeMillis());
	    this.data = sd.format(dataAtual);        
	    return this.data;
	}



	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public void ImprimeExtratoDetalhado() {
		System.out.println(getDataAtual());
		System.out.println("Nome: " + this.getTitular());
		System.out.println("Número: " + this.numero);
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Limite: " + this.getLimite());

	}

}
