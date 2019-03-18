package state;

import state.banco.Conta;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.deposita(100);
		
		System.out.println("SALDO: " + conta.getSaldo() + " ESTADO: " + conta.getEstadoConta());
		
		conta.saca(100);
		
		System.out.println("SALDO: " + conta.getSaldo() + " ESTADO: " + conta.getEstadoConta());
		
		conta.saca(5);
		
	}

}
