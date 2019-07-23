package Orientacao_a_Objetos;

public class Aluno {
	public String nome;
	public int rg;
	public String dataNasc;
	public Turma turma;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int rg, String dataNasc, Turma turma) {
		this.nome = nome;
		this.rg = rg;
		this.dataNasc = dataNasc;
		this.turma = turma;
	}
}
