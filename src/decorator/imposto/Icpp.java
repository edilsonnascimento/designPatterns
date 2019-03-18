package decorator.imposto;

import chainOfResponsibility.desconto.Orcamento;

public class Icpp extends Imposto{

	public Icpp() {
		// TODO Auto-generated constructor stub
	}
	
	public Icpp(Imposto outroImposto) {
		super.outroImposto = outroImposto;
		
	}

	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.10 + super.outroImposto.calcula(orcamento);
	}

}
