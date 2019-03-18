package strategy.imposto;

import chainOfResponsibility.desconto.Orcamento;

public class Icms implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

}
