package state.orcamento;

public class OrcamentoFinalizado implements EstadoDoOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamento no estado Finalizado, não permitido desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		// TODO Auto-generated method stub
		
	}

}
