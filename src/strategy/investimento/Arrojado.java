package strategy.investimento;

import java.util.Random;

public class Arrojado implements Investimento{

	private Random random;
	
	
	public Arrojado() {
		this.random = new Random();
	}


	@Override
	public double calcula(Investidor investidor) {
		int chute = random.nextInt(10);
		
        if(chute >= 0 && chute <= 1) return investidor.getSaldo() * 0.05;
        
        if (chute >= 2 && chute <= 4) return investidor.getSaldo() * 0.03;
        
        return investidor.getSaldo() * 0.006;
	}

}
