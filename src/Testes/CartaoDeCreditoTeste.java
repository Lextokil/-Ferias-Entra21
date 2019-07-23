package Testes;

import Orientacao_a_Objetos.CartaoDeCredito;

public class CartaoDeCreditoTeste {

	public static void main(String[] args) {
		CartaoDeCredito cdc1 = new CartaoDeCredito();
		CartaoDeCredito cdc2 = new CartaoDeCredito();
		cdc1.dataValidade = "23/07/2024";
		cdc1.numero = 12345;
		cdc2.dataValidade = "23/07/2035";
		cdc2.numero = 54321;
		
		System.out.println(cdc1.dataValidade +" "+ cdc1.numero);
		System.out.println(cdc2.dataValidade +" "+ cdc2.numero);
		

	}

}
