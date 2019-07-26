package ClassesAbstratas;

import java.text.SimpleDateFormat;



public abstract class ContaAbstrata  {
		private String titular;
		private Double saldo;
		private Double limite;
		
		
		public ContaAbstrata(String titular, Double saldo, Double limite) {
			super();
			this.titular = titular;
			this.saldo = saldo;
			this.limite = limite;
			
		}
		
		
		public String getTitular() {
			return titular;
		}
		public void setTitular(String titular) {
			this.titular = titular;
		}
		public Double getSaldo() {
			return saldo;
		}
		public void setSaldo(Double saldo) {
			this.saldo = saldo;
		}
		public Double getLimite() {
			return limite;
		}
		public void setLimite(Double limite) {
			this.limite = limite;
		}
		


	
		
		public abstract void ImprimeExtratoDetalhado();
}
