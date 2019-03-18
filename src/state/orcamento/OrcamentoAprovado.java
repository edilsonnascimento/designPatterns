package state.orcamento;

public class OrcamentoAprovado implements EstadoDoOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		
		double valorDesconto = orcamento.getValor() * 0.02;
		
		if(! orcamento.getDescontoAplicado()) {
			orcamento.setValor(orcamento.getValor() - valorDesconto);
			orcamento.setDescontoAplicado(true);
		}
		else throw new RuntimeException(" Orcamento no estado 'Aprovado', desconto já aplicado");
	}	

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento Já esta'no Estado Aprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento Aprovado, este estado só pode ser alterando no Orcamento Em Aprovação.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstadoAtual(new OrcamentoFinalizado());
	}

}
