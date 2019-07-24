package Testes;

import Orientacao_a_Objetos.Aluno;
import Orientacao_a_Objetos.Turma;

public class AlunoTeste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		Turma t1 = new Turma("Basico",5, "XXt", 6 );

		a1.setDataNasc("17/06/1997"); 
		a1.setNome("Carlos"); 
		a1.setRg(5054899); 
		a1.setTurma(t1); 

		a2.setDataNasc("23/03/1950"); 
		a2.setNome("Chiquito");
		a2.setRg(234535423);
		
		System.out.println(a1.getDataNasc() + " " + a1.getNome() + " "+ a1.getRg()+ " "+ a1.getTurma().getSigla());
		System.out.println(a2.getDataNasc() + " " + a2.getNome() + " "+ a2.getRg());
	}

}
