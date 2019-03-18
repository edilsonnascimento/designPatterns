package state.banco;

public class Negativo implements EstadoConta {

	public void saca(Conta conta, double valor) {
		
		throw new RuntimeException("Sua conta está no vermelho. Não é possível sacar!");
	}

	public void deposita(Conta conta, double valor) {
		
		conta.saldo += valor * 0.95;
		
		if (conta.saldo > 0)
			conta.estado = new Positivo();		
	}

	@Override
	public String toString() {
		return "Negativo []";
	}	

}
