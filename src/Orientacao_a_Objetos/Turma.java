package Orientacao_a_Objetos;

public class Turma {
	public String tipoEnsino;
	public int periodo;
	public String sigla;
	public int serie;
	
	public Turma() {
		
	}
	
	public Turma(String tipoEnsino, int periodo, String sigla, int serie) {
		super();
		this.tipoEnsino = tipoEnsino;
		this.periodo = periodo;
		this.sigla = sigla;
		this.serie = serie;
	}
}
