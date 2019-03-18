package state.orcamento;

public class OrcamentoReprovado implements EstadoDoOrcamento{
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Não pode aplicar desconto para orcamento Reprovado.");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcameto Reprovado, śo pode ser Finalizado.");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcameto já está Reprovado.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstadoAtual(new OrcamentoFinalizado());
	}

}
