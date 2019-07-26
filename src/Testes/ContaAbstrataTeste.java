package Testes;

import ClassesAbstratas.ContaAbstrata;
import ClassesAbstratas.ContaPoupanca2;

public class ContaAbstrataTeste {

	public static void main(String[] args) {
		ContaAbstrata ca = new ContaPoupanca2("Ze", 10000.0, 20000.0, 2347);
		
		ca.ImprimeExtratoDetalhado();
		

	}

}
