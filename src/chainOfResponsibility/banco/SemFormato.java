package chainOfResponsibility.banco;

public class SemFormato implements Resposta{
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		
		System.out.println(conta.getNome() + conta.getSaldo());
		
	}

	@Override
	public void setProxima(Resposta resposta) {
		//
	}

}
