package strategy.imposto;

import chainOfResponsibility.desconto.Orcamento;

public class Iss implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
