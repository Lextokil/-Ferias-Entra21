package Testes;

import Orientacao_a_Objetos.Turma;

public class TurmaTeste {

	public static void main(String[] args) {
		Turma t1 = new Turma();
		Turma t2 = new Turma();
		
		t1.setPeriodo(6); 
		t1.setSerie(4);
		t1.setSigla("XXT"); 
		t1.setTipoEnsino("basico"); 
		
		t2.setPeriodo(8); 
		t2.setSerie(7);
		t2.setSigla("TTX"); 
		t2.setTipoEnsino("Fundamental"); 
		
		System.out.println(t1.getPeriodo() + " " + t1.getSerie() + " "+ t1.getSerie() + " " + t1.getTipoEnsino());
		System.out.println(t2.getPeriodo() + " " + t2.getSerie() + " "+ t2.getSigla() + " " + t2.getTipoEnsino());

	}

}
