package builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class BuilderNotaFiscal {
	
	private String razaoSocial;
	private String cnpj;
	private LocalDate dataEmissao;
	private Double valorTotal;
	private Double impostos;
	private List<ItemNotaFiscal> itens;
	private String observacoes;
 
	
	

	public BuilderNotaFiscal() {
		this.dataEmissao = LocalDate.now();
		this.valorTotal = 0.0;
		this.impostos = 0.0;
		this.itens = new ArrayList<ItemNotaFiscal>();
	}

	public int geraNumeroNotaFiscal() {
		Random aleatorio = new Random();
		
		return aleatorio.nextInt(999999);
	}
	public BuilderNotaFiscal paraEmpresa(String razaoSocial) {
		
		this.razaoSocial = razaoSocial;
		
		return this;
	}
	
	public BuilderNotaFiscal comCnpj(String cnpj) {
		
		this.cnpj = cnpj;
		
		return this;
	}
	
	public BuilderNotaFiscal emitidoNa(LocalDate novaData) {
		
		this.dataEmissao = novaData;
		return this;		
	}
	
	public BuilderNotaFiscal com(ItemNotaFiscal item) {
		
		this.valorTotal += item.getValor();
		itens.add(item);
		this.impostos = valorTotal * 0.05;
		
		return this;
	}
	

	public BuilderNotaFiscal comObervacao(String observacoes) {
		
		this.observacoes = observacoes;
		
		return this;
	}
	
	public NotaFiscal constroi() {
		return new NotaFiscal(razaoSocial, this.geraNumeroNotaFiscal(), cnpj, dataEmissao, valorTotal, impostos, itens, observacoes);
	}
}
