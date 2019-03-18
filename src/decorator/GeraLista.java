package decorator;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import decorator.filtro.Conta;

public class GeraLista {
	
	public List<Conta> gera() {
	
		List<Conta> contas = new ArrayList<Conta>();
		
		for (int i = 0; i < 5; i++) {
			contas.add(new Conta(90.0 + i, LocalDate.of(2019, Month.FEBRUARY, 12)));			
		}
		
		for (int i = 0; i < 5; i++) {
			contas.add(new Conta(90.0 + i, LocalDate.of(2019, Month.MARCH, 12)));			
		}
			
		for (Conta conta : contas) {
			System.out.println(conta.toString());
		}
		
		return contas; 
	}

}
