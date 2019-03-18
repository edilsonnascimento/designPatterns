package decorator.imposto;

import chainOfResponsibility.desconto.Orcamento;

public class Icms extends Imposto{

	
	public Icms() {}
	
	public Icms(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.10 + calculoDeOutroImposto(orcamento);
	}
	
	
}
