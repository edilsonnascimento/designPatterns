package strategy.investimento;

import java.util.Random;

public class Moderado implements Investimento{
	
	  private Random random;

      public Moderado() {
        this.random = new Random();
      }

	@Override
	public double calcula(Investidor investidor) {
		
		//pode ser 0(zero) ou 1(um)
		if(random.nextInt(2) == 0) return investidor.getSaldo() * 0.025;
		
		return investidor.getSaldo() * 0.007;		
	}

}
