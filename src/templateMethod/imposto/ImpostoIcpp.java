package templateMethod.imposto;

import chainOfResponsibility.desconto.Orcamento;

public class ImpostoIcpp extends TemplateDeImpostoCondicional{

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public double minimaTaxaca(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

}
