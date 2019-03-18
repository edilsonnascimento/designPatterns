package chainOfResponsibility.banco;

public class FormatoCsv implements Resposta {

	private Resposta resposta;

	@Override
	public void responde(Requisicao req, Conta conta) {
		
		if(req.getFormato().equals(Formato.CSV))
			System.out.println(";" + conta.getNome() + ";" + conta.getSaldo() + ";");		
		else 
			this.resposta.responde(req, conta);
		

	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}
