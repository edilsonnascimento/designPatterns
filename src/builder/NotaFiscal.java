package builder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	
	private Integer numeroNotaFiscal;
	private String razaoSocial;
	private String cnpj;
	private LocalDate dataEmissao;
	private Double valorBruto;
	private Double impostos;
	private List<ItemNotaFiscal> itens;
	private String observacoes;
	
	public NotaFiscal(String razaoSocial, Integer numeroNotaFiscal, String cnpj, LocalDate dataEmissao, Double valorBruto, Double impostos,
			List<ItemNotaFiscal> itens, String observacoes) { 
		
		this.numeroNotaFiscal = numeroNotaFiscal;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataEmissao = dataEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public Integer getNumeroNotaFiscal() {		
		return this.numeroNotaFiscal;
	}
	
	public void setNumeroNotaFiscal(Integer numeroNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDataEmissao() {
		
	    DateTimeFormatter formatador =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dataEmissao.format(formatador);
	}

	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(Double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public Double getImpostos() {
		return impostos;
	}

	public void setImpostos(Double impostos) {
		this.impostos = impostos;
	}

	public List<ItemNotaFiscal> getItens() {
		return itens;
	}

	public void setItens(List<ItemNotaFiscal> itens) {
		this.itens = itens;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	@Override
	public String toString() {
		return "NotaFiscal:" + this.numeroNotaFiscal + "\n\n Razao Social: " + razaoSocial + ", CNPJ: " + cnpj + ", Data Emissao:" + getDataEmissao()
				+ ", \n itens=" + itens +  "\n\nvalorBruto=" + valorBruto + ", \nimpostos=" + impostos
                + "\n\n"+ observacoes + "]";
	}	
	
}
