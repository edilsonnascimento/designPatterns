package templateMethod;

import chainOfResponsibility.desconto.Item;
import chainOfResponsibility.desconto.Orcamento;
import strategy.imposto.CalculadoraImposto;
import templateMethod.imposto.ImpostoIcpp;
import templateMethod.imposto.ImpostoIhit;
import templateMethod.imposto.ImpostoIkcv;

public class TesteTempleteMethod {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(1000.0);
		
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		orcamento.adicionaItem(new Item("BOLSA", 250.0));
		orcamento.adicionaItem(new Item("ESTOJO", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		
		ImpostoIcpp iccp = new ImpostoIcpp();
		ImpostoIkcv ikcv = new ImpostoIkcv();
		ImpostoIhit ihit = new ImpostoIhit();
		
		CalculadoraImposto calcula = new CalculadoraImposto();
		
		calcula.realizaCalculo(orcamento, ikcv);
		calcula.realizaCalculo(orcamento, iccp);
		calcula.realizaCalculo(orcamento, ihit);
		 
		
	}

}
