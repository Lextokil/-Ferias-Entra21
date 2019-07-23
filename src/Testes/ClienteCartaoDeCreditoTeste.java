package Testes;

import Orientacao_a_Objetos.CartaoDeCredito;
import Orientacao_a_Objetos.Cliente;

public class ClienteCartaoDeCreditoTeste {

	public static void main(String[] args) {
		CartaoDeCredito cdc1 = new CartaoDeCredito();
		Cliente c1 = new Cliente(01,"Cadu");
		
		cdc1.dataValidade = "23/07/2024";
		cdc1.numero = 12345;
		cdc1.cliente = c1;
		
		System.out.println(cdc1.dataValidade +" "+ cdc1.numero + " "+ cdc1.cliente.nome);

	}

}
