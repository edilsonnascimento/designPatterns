package strategy.investimento;

public class Calcula {
	
	public void realiza (Investimento investimento, Investidor investidor) {
		
		double resultado = investimento.calcula(investidor);
		
		investidor.depositaValor(resultado * 0.75);
		
		System.out.println(investidor.getSaldo());
		
	}

}
