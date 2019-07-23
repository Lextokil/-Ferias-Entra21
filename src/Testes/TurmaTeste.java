package Testes;

import Orientacao_a_Objetos.Turma;

public class TurmaTeste {

	public static void main(String[] args) {
		Turma t1 = new Turma();
		Turma t2 = new Turma();
		
		t1.periodo = 6;
		t1.serie = 4;
		t1.sigla = "XXT";
		t1.tipoEnsino = "basico";
		
		t2.periodo = 8;
		t2.serie = 6;
		t2.sigla = "TTX";
		t2.tipoEnsino = "Fundamental";
		
		System.out.println(t1.periodo + " " + t1.serie + " "+ t1.sigla + " " + t1.tipoEnsino);
		System.out.println(t2.periodo + " " + t2.serie + " "+ t2.sigla + " " + t2.tipoEnsino);

	}

}
