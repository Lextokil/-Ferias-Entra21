package Orientacao_a_Objetos;

public class Cliente {
	private int Id;
	private String nome;
	
	public Cliente(){
		
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente(int id, String nome){
		this.Id = id;
		this.nome = nome;
	}
}
