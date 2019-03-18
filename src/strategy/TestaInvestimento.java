package strategy;

import strategy.investimento.Arrojado;
import strategy.investimento.Calcula;
import strategy.investimento.Conservador;
import strategy.investimento.Investidor;
import strategy.investimento.Moderado;

public class TestaInvestimento {
	
	public static void main(String[] args) {
		
		Investidor investidor = new Investidor(100.0);
		Calcula calcula = new Calcula();
		
		
		Conservador investimentoConservador = new Conservador();		
		calcula.realiza(investimentoConservador, investidor);
		
		Moderado investimentoModerado = new Moderado();
		calcula.realiza(investimentoModerado, investidor);
		
		Arrojado investimentoArrujado = new Arrojado();
		calcula.realiza(investimentoArrujado, investidor);

		
		

	}

}
