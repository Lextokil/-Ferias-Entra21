package Testes;

import Orientacao_a_Objetos.CartaoDeCredito;
import Orientacao_a_Objetos.Cliente;

public class ClienteCartaoDeCreditoTeste {

	public static void main(String[] args) {
		CartaoDeCredito cdc1 = new CartaoDeCredito();
		Cliente c1 = new Cliente(01,"Cadu");
		
		cdc1.setDataValidade("23/07/2024"); 
		cdc1.setNumero(12345);
		cdc1.setCliente(c1); 
		
		System.out.println(cdc1.getDataValidade() +" "+ cdc1.getNumero() + " "+ cdc1.getCliente().getNome());

	}

}
