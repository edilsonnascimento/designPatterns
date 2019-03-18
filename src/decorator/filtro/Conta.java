package decorator.filtro;

import java.time.LocalDate;

public class Conta {
	
	private Double saldo;
	private LocalDate dataAbertura;
	
	public Conta(Double saldo, LocalDate dataAbertura) {
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public LocalDate getDataAbertura() {
		return dataAbertura;
	}
	
	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", dataAbertura=" + dataAbertura + "]";
	}

}
