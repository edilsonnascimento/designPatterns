package chainOfResponsibility;

import chainOfResponsibility.desconto.CalculadorDeDescontos;
import chainOfResponsibility.desconto.Item;
import chainOfResponsibility.desconto.Orcamento;

public class TestaDescontos {

	public static void main(String[] args) {
        CalculadorDeDescontos calculador = new CalculadorDeDescontos();

            Orcamento orcamento = new Orcamento(1000.0);
            orcamento.adicionaItem(new Item("CANETA", 250.0));
            orcamento.adicionaItem(new Item("LAPIS", 250.0));
//            orcamento.adicionaItem(new Item("BORRACHA", 250.0));
//            orcamento.adicionaItem(new Item("ESTOJO", 250.0));
//            orcamento.adicionaItem(new Item("MOCHILA", 250.0));
//            orcamento.adicionaItem(new Item("CADERNO", 250.0));

            double desconto = calculador.calcula(orcamento);

            System.out.println(desconto);

      }
}
