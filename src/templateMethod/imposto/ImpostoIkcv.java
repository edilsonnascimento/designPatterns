package templateMethod.imposto;

import chainOfResponsibility.desconto.Item;
import chainOfResponsibility.desconto.Orcamento;

public class ImpostoIkcv extends TemplateDeImpostoCondicional{

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temMaisQue100Reais(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public double minimaTaxaca(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
	
	private boolean temMaisQue100Reais(Orcamento orcamento) {
		
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100) return true;
		} 	
		
		return false;
	}
	

}
