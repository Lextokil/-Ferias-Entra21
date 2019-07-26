package Testes;

import ClassesAbstratas.FuncionarioAbstrato;
import ClassesAbstratas.Gerente2;

public class FuncionarioTesteAbstrato {

	public static void main(String[] args) {
		FuncionarioAbstrato f = new Gerente2("Carlos", 2000000000.0);
		FuncionarioAbstrato f2 = new Gerente2("Carlos",2000.0);
		
		System.out.println(f.CalcularBonificacao(15.0, f2));
	}

}
