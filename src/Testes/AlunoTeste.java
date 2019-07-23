package Testes;

import Orientacao_a_Objetos.Aluno;
import Orientacao_a_Objetos.Turma;

public class AlunoTeste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		Turma t1 = new Turma("Basico",5, "XXt", 6 );

		a1.dataNasc = "17/06/1997";
		a1.nome = "Carlos";
		a1.rg = 5054899;
		a1.turma = t1;

		a2.dataNasc = "23/03/1950";
		a2.nome = "Chiquito";
		a2.rg = 234535423;
		
		System.out.println(a1.dataNasc + " " + a1.nome + " "+ a1.rg+ " "+ a1.turma.sigla);
		System.out.println(a2.dataNasc + " " + a2.nome + " "+ a2.rg);
	}

}
