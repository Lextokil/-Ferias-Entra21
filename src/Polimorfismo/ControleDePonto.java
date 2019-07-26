package Polimorfismo;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class ControleDePonto {
	private String data;
	
	public String getDataAtual() {        
	    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy:HH:mm:ss");
	    Date dataAtual = new Date(System.currentTimeMillis());
	    this.data = sd.format(dataAtual);        
	    return this.data;
	}
	
	public void RegistrarEntrada(FuncionarioBanco func) {
		System.out.println("Funcionário: "+func.getNome());
		System.out.println("Entrou as: "+ getDataAtual());
		
	}
	
	public void RegistrarSaida(FuncionarioBanco func) {
		System.out.println("Funcionário: "+func.getNome());
		System.out.println("Saiu as: "+ getDataAtual());
	}
}
