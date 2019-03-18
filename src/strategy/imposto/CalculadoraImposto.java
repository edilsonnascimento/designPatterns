package strategy.imposto;

import chainOfResponsibility.desconto.Orcamento;

public class CalculadoraImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		
		double valor = imposto.calcula(orcamento);
		
		System.out.println("Imposto " + imposto.getClass().getSimpleName() + " valor: " + valor);
	}

}
