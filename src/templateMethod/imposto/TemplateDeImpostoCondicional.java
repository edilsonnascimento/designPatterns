package templateMethod.imposto;

import chainOfResponsibility.desconto.Orcamento;
import strategy.imposto.Imposto;

public abstract class TemplateDeImpostoCondicional implements Imposto{


	@Override
	public double calcula(Orcamento orcamento) {
		
		if(deveUsarMaximaTaxacao(orcamento))
			return maximaTaxacao(orcamento);
		else return minimaTaxaca(orcamento);
		
	}

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	
	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxaca(Orcamento orcamento);
	
}
