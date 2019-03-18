package templateMethod.imposto;

import chainOfResponsibility.desconto.Orcamento;

public class ImpostoIhit extends TemplateDeImpostoCondicional {

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		if (itemRepetido(orcamento)) return true;
		return false;
	}

	private boolean itemRepetido(Orcamento orcamento) {
		int cont = 0;
	    
		for (int i = 0; i < orcamento.getItens().size(); i++) {
			for (int j = i + 1; j < orcamento.getItens().size(); j++) {
				if (orcamento.getItens().get(i).getNome().equals(orcamento.getItens().get(j).getNome()))					
					cont ++;				
			}			
		}        
		
        if (cont != 0) return true;
        
		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100;
	}

	@Override
	public double minimaTaxaca(Orcamento orcamento) {
		double taxa = orcamento.getItens().size() / 100.0;
		return orcamento.getValor() * taxa;
	}

}
