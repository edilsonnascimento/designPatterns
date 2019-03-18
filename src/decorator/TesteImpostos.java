package decorator;

import chainOfResponsibility.desconto.Orcamento;
import decorator.imposto.Icms;
import decorator.imposto.Icpp;
import decorator.imposto.Ikcv;
import decorator.imposto.Imposto;
import decorator.imposto.Iss;

public class TesteImpostos {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(1000.0);
		
		Imposto iss = new Iss(new Icms());
		
		Imposto icpp = new Icpp(iss);
		
		Imposto ikcv = new Ikcv(icpp);
		
		double valor = ikcv.calcula(orcamento);
		System.out.println(valor);
	}

}
