package decorator.imposto;

import chainOfResponsibility.desconto.Orcamento;

public abstract class Imposto {

	protected Imposto outroImposto;
	
	public Imposto() {}
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public abstract double calcula(Orcamento orcamento);
	
	protected double calculoDeOutroImposto(Orcamento orcamento) {
		
		if (this.outroImposto == null) return 0;
		
		return outroImposto.calcula(orcamento);
	}

}
