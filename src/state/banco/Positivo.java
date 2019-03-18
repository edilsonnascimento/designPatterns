package state.banco;

public class Positivo implements EstadoConta {

	public void saca(Conta conta, double valor) {
		
		conta.saldo -= valor;

		if (conta.saldo < 0)
			conta.estado = new Negativo();

	}

	public void deposita(Conta conta, double valor) {
		
		conta.saldo += valor * 0.98;
	}

	@Override
	public String toString() {
		return "Positivo []";
	}	

}
