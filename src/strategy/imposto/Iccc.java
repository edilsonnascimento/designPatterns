package strategy.imposto;

import chainOfResponsibility.desconto.Orcamento;

public class Iccc implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		
		if (orcamento.getValor() < 1000)
			return orcamento.getValor() * 0.05;
		
		if (orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000)  
			return orcamento.getValor()* 0.07;
		
    	return (orcamento.getValor() * 0.08) + 30;
		
	}

}
