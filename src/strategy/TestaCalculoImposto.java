package strategy;

import chainOfResponsibility.desconto.Orcamento;
import strategy.imposto.CalculadoraImposto;
import strategy.imposto.Iccc;
import strategy.imposto.Icms;
import strategy.imposto.Iss;

public class TestaCalculoImposto {
	
	public static void main(String[] args) {
		CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
		Orcamento orcamento = new Orcamento(10000.0);
		
		Icms icms = new Icms();		
		calculadoraImposto.realizaCalculo(orcamento, icms);
		
		Iss iss = new Iss();
		calculadoraImposto.realizaCalculo(orcamento, iss);
		
		Iccc iccc = new Iccc();
		calculadoraImposto.realizaCalculo(orcamento, iccc);		
	}

}
