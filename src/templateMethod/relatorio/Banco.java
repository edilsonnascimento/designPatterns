package templateMethod.relatorio;

import java.util.List;

public class Banco {
	
	private String nome;
	private String agencia;
	private String telefone;
	private String endereco;
	private String email;
	private List<Conta> contas;
	
	
	public Banco(String nome, String agencia, String telefone, String endereco, String email, List<Conta> contas) {
		super();
		this.nome = nome;
		this.agencia = agencia;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.contas = contas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}	
	
}
