package Testes;

import Interfaces.ContaCorrenteI;
import Interfaces.ContaI;

public class IntefaceTeste {

	public static void main(String[] args) {
		ContaI c1 = new ContaCorrenteI("Carlos", 2000.0);
		ContaI c2 = new ContaCorrenteI("Xico", 5000.0);
		c1.deposita(500.0,c1);
		c1.geradorExtrato(c1);
		c2.saca(3500.0,c2);
		c2.geradorExtrato(c2);

	}

}
