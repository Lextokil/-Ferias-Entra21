package ClassesAbstratas;

public class Gerente2 extends FuncionarioAbstrato {

	public Gerente2(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double CalcularBonificacao(Double porcent, FuncionarioAbstrato func) {
		porcent = porcent/100;
		
		return (func.getSalario()* porcent);
	}
}
