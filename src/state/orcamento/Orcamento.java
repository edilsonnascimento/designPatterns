package state.orcamento;

public class Orcamento {
	
	private Double valor;
	private EstadoDoOrcamento estadoAtual;
	private Boolean DescontoAplicado;
	
	
	public Orcamento(Double valor) {
		this.valor = valor;
		this.estadoAtual = new OrcamentoEmAprovacao();
		this.DescontoAplicado = false;
	}
	
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public EstadoDoOrcamento getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(EstadoDoOrcamento estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

	public void aplicaDescontoExtra() {		
		estadoAtual.aplicaDescontoExtra(this);		
	}
	
	public Boolean getDescontoAplicado() {
		return DescontoAplicado;
	}

	public void setDescontoAplicado(Boolean descontoAplicado) {
		DescontoAplicado = descontoAplicado;
	}

	@Override
	public String toString() {
		return "Orcamento [valor=" + valor + ", estadoAtual=" + estadoAtual + "]";
	}

}
