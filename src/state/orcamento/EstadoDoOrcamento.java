package state.orcamento;

public interface EstadoDoOrcamento {
	
	public void aplicaDescontoExtra(Orcamento orcamento);
	
    public void aprova(Orcamento orcamento);
    
    public void reprova(Orcamento orcamento);
    
    public void finaliza(Orcamento orcamento);

}
