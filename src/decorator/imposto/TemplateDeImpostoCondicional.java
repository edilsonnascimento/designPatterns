package decorator.imposto;

import chainOfResponsibility.desconto.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		
		if (deveUsarMaximaTaxacao(orcamento)) return maximaTaxacao(orcamento) + super.calculoDeOutroImposto(orcamento);
		
		return minimoTaxacao(orcamento) + super.calculoDeOutroImposto(orcamento);
	}
	
	public abstract double minimoTaxacao(Orcamento orcamento);
	
	public abstract double maximaTaxacao(Orcamento orcamento);
	
	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
