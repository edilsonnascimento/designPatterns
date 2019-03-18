package chainOfResponsibility.desconto;

public class DescontoPorVendaCasada implements Desconto{
	
	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		
		if (orcamento.exite("LAPIS", orcamento) && (orcamento.exite("CANETA", orcamento)))
			return orcamento.getValor() * 0.05;
		
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
	}

}
