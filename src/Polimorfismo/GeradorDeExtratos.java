package Polimorfismo;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class GeradorDeExtratos {
	private String data;
	
	public String getDataAtual() {        
	    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
	    Date dataAtual = new Date(System.currentTimeMillis());
	    this.data = sd.format(dataAtual);        
	    return this.data;
	}
	
	public void GerarExtrato(Conta conta) {
		System.out.println(getDataAtual());
		System.out.println("Nome: " +conta.getNome());
		System.out.println("Saldo: " +conta.getSaldo());
		System.out.println("Limite: " +conta.getLimite());
	}
}
