package Testes;

import Orientacao_a_Objetos.CartaoDeCredito;
import Orientacao_a_Objetos.Cliente;

public class CartaoDeCreditoTeste {

	public static void main(String[] args) {
		CartaoDeCredito cdc1 = new CartaoDeCredito();
		CartaoDeCredito cdc2 = new CartaoDeCredito();
		
		Cliente c1 = new Cliente(01,"Cadu");
		Cliente c2 = new Cliente(02, "Xita");
		
		
		cdc1.dataValidade = "23/07/2024";
		cdc1.numero = 12345;
		cdc1.cliente = c1;
		cdc2.dataValidade = "23/07/2035";
		cdc2.numero = 54321;
		cdc2.cliente = c2;
		
		System.out.println(cdc1.dataValidade +" "+ cdc1.numero + " "+ cdc1.cliente.nome);
		System.out.println(cdc2.dataValidade +" "+ cdc2.numero+ " " +cdc2.cliente.nome);
		

	}

}
