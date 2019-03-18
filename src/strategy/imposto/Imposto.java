package strategy.imposto;

import chainOfResponsibility.desconto.Orcamento;

public interface Imposto {
	
	public double calcula(Orcamento orcamento);
}
