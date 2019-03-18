package state.orcamento;

public class OrcamentoEmAprovacao implements EstadoDoOrcamento{
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		
		double valorDesconto = orcamento.getValor() * 0.05;
		
		if(! orcamento.getDescontoAplicado()) {  
			orcamento.setValor(orcamento.getValor() - valorDesconto);
			orcamento.setDescontoAplicado(true);
		}
		
		else throw new RuntimeException(" Orcamento no estado 'Em Aprovação', desconto já aplicado");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.setEstadoAtual(new OrcamentoAprovado());
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.setEstadoAtual(new OrcamentoReprovado());
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento em Aprovação não pode ser Finalizado!");
	}

	@Override
	public String toString() {
		return "OrcamentoEmAprovacao";
	}

}
