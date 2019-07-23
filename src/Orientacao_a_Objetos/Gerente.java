package Orientacao_a_Objetos;

public class Gerente  {
	public Double salario;
	
	public Gerente(Double salario) {
		super();
		this.salario = salario;
	}

	
	
	public void AumentarSalarioFixo() {
		this.salario += this.salario * 0.1;
	}
	
	public void AumentarSalarioVariavel(Double porcent) {
		porcent = porcent/100;
		this.salario += this.salario * porcent;
	}

	
}
