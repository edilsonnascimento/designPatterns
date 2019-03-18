package chainOfResponsibility.banco;

public class FormatoXml implements Resposta{

	private Resposta resposta;
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato().equals(Formato.XML))
			System.out.println("<conta><titula>" + conta.getNome() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
		else 
			this.resposta.responde(req, conta);
	}

	@Override
	public void setProxima(Resposta resposta) {
		
		this.resposta = resposta;
		
	}

}
