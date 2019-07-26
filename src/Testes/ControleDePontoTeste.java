package Testes;

import Polimorfismo.ControleDePonto;
import Polimorfismo.FuncionarioBanco;
import Polimorfismo.GerenteBanco;
import Polimorfismo.TelefonistaBanco;

public class ControleDePontoTeste {

	public static void main(String[] args) {
		ControleDePonto cdp = new ControleDePonto();
		FuncionarioBanco g = new GerenteBanco("Carlos", 2000.0);
		FuncionarioBanco t = new TelefonistaBanco("Cheila", 1500.0);
		
		cdp.RegistrarEntrada(g);
		cdp.RegistrarSaida(g);
		
		cdp.RegistrarEntrada(t);
		cdp.RegistrarSaida(t);
	}

}
