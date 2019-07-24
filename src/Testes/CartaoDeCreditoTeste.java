package Testes;

import Orientacao_a_Objetos.CartaoDeCredito;
import Orientacao_a_Objetos.Cliente;

public class CartaoDeCreditoTeste {

	public static void main(String[] args) {
		CartaoDeCredito cdc1 = new CartaoDeCredito();
		CartaoDeCredito cdc2 = new CartaoDeCredito();
		
		Cliente c1 = new Cliente(01,"Cadu");
		Cliente c2 = new Cliente(02, "Xita");
		
		
		cdc1.setDataValidade("23/07/2024");
		cdc1.setNumero(12345);
		cdc1.setCliente(c1); 
		cdc2.setDataValidade("23/07/2035"); 
		cdc2.setNumero(54321); 
		cdc2.setCliente(c2); 
		
		System.out.println(cdc1.getDataValidade() +" "+ cdc1.getNumero() + " "+ cdc1.getCliente().getNome());
		System.out.println(cdc2.getDataValidade() +" "+ cdc2.getNumero()+ " " +cdc2.getCliente().getNome());
		

	}

}
