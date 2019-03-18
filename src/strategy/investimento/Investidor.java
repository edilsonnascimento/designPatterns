package strategy.investimento;

public class Investidor {
	
	private Double saldo;

	public Investidor(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void depositaValor(Double valor) {
		this.saldo += valor;
	}

}
