package chainOfResponsibility.desconto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Orcamento {
	
	private Double valor;
	private List<Item> itens;
	
	public Orcamento(Double valor)  {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	public void adicionaItem(Item item) {
		this.itens.add(item);
	}
	
	public Boolean exite(String nomeDoItem, Orcamento orcamento) {
		
		for (Item item : orcamento.getItens()) {
			if(item.getNome().equals(nomeDoItem))
				return true;
		}		
		return false;
	}

}
