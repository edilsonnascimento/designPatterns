package templateMethod.relatorio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
	
	public Banco inicializa() {
		
		List<Conta> contas = new ArrayList<Conta>();
		
		Conta c1 = new Conta();
		c1.setNumero(32525);
		c1.setTitular("Alexandre Pato");
		c1.setSaldo(new BigDecimal(10000.0));
		contas.add(c1);
	
		Conta c2 = new Conta();		
		c2.setNumero(62555);
		c2.setTitular("Everton Ribeiro");
		c2.setSaldo(new BigDecimal(1200.0));
		contas.add(c2);
		
		Conta c3 = new Conta();		
		c3.setNumero(79848);
		c3.setTitular("Marco Biach");
		c3.setSaldo(new BigDecimal(8500.0));
		contas.add(c3);
		
		Banco banco = new Banco("BRADESCO", "0352-8", "(041) 3025-8578", "Rua da Lapa, 5000", "bradesco@gmail.com", contas);
		
		return banco;
	}

}
