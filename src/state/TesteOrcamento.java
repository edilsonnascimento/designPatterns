package state;

import state.orcamento.Orcamento;
import state.orcamento.OrcamentoAprovado;

public class TesteOrcamento {
	
	public static void main(String[] args) {
		
		Orcamento veterinario = new Orcamento(100.0);
		
		veterinario.aplicaDescontoExtra();
		
		veterinario.setEstadoAtual(new OrcamentoAprovado());
		veterinario.aplicaDescontoExtra();
		
//		veterinario.setEstadoAtual(new OrcamentoReprovado());		
//		veterinario.aplicaDescontoExtra();

//		veterinario.setEstadoAtual(new OrcamentoFinalizado());		
//		veterinario.aplicaDescontoExtra();

		System.out.println(veterinario.toString());
	}

}
