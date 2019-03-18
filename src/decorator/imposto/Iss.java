package decorator.imposto;

import chainOfResponsibility.desconto.Orcamento;

public class Iss extends Imposto{

	
	public Iss() {
		}
	
	public Iss(Imposto outroImposto){
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.10 + super.calculoDeOutroImposto(orcamento);
	}


}
