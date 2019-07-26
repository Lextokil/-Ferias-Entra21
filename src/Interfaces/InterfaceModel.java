package Interfaces;

import java.sql.Date;
import java.text.SimpleDateFormat;

public abstract class InterfaceModel {
	
	
private String data;
	
	public String getDataAtual() {        
	    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
	    Date dataAtual = new Date(System.currentTimeMillis());
	    this.data = sd.format(dataAtual);        
	    return this.data;
	}
	

	
	public void geradorExtrato(ContaI conta) {
		System.out.println(getDataAtual());
		System.out.println("Nome: " +conta.getNome());
		System.out.println("Saldo: " +conta.getSaldo());
		
		
	}

	public abstract void deposita(double valor, ContaI conta);
	
	public abstract void saca(double valor, ContaI conta);






	
	

}
