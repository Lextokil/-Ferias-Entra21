package Testes;

import Polimorfismo.ContaCorrente;
import Polimorfismo.GeradorDeExtratos;

public class GeradorDeExtratosTeste {

	public static void main(String[] args) {
		GeradorDeExtratos gde = new GeradorDeExtratos();
		ContaCorrente c = new ContaCorrente("Carlos",1234, 1000.0, 2000.0);
		gde.GerarExtrato(c);
	}

}
