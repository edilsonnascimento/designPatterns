package strategy.investimento;

public class Conservador implements Investimento{

	@Override
	public double calcula(Investidor investidor) {
		return investidor.getSaldo() * 0.008;
	}

}
