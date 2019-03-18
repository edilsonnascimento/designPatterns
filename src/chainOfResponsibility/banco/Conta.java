package chainOfResponsibility.banco;

public class Conta {
	
	private String nome;
	private Integer saldo;

	public Conta(Integer saldo, String nome) {
		this.saldo = saldo;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
	

}
