package Orientacao_a_Objetos;

public class Aluno {
	private String nome;
	private int rg;
	private String dataNasc;
	private Turma turma;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Aluno() {
		
	}
	
	public Aluno(String nome, int rg, String dataNasc, Turma turma) {
		this.nome = nome;
		this.rg = rg;
		this.dataNasc = dataNasc;
		this.turma = turma;
	}
}
