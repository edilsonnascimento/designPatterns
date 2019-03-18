package decorator.imposto;

import chainOfResponsibility.desconto.Orcamento;

public class Ikcv extends Imposto{

	
	public Ikcv() {}
	
	public Ikcv(Imposto outroIposto) {
		super.outroImposto = outroIposto;
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.10 + super.calculoDeOutroImposto(orcamento);
	}

}
