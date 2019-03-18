package chainOfResponsibility.banco;

public class FormatoRequerido {

	public void verifica(Requisicao req, Conta conta) {
		Resposta xml = new FormatoXml();
		Resposta csv = new FormatoCsv();
		Resposta porcento = new FormatoPorcento();
		Resposta semFormato = new SemFormato();
		
		xml.setProxima(csv);
		csv.setProxima(porcento);
		porcento.setProxima(semFormato);
		
		xml.responde(req, conta);

	}

}
