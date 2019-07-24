package Orientacao_a_Objetos;

public class Turma {
	private String tipoEnsino;
	private int periodo;
	private String sigla;
	private int serie;
	
	public String getTipoEnsino() {
		return tipoEnsino;
	}

	public void setTipoEnsino(String tipoEnsino) {
		this.tipoEnsino = tipoEnsino;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

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
