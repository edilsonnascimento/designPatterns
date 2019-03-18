package templateMethod.relatorio;

public class RelatorioSimples extends Relatorio{

	@Override
	public void cabecalho(Banco banco) {
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println("CABEÇALHO");
		System.out.println("BANCO: " + banco.getNome() 
				           + " - TELEFONE: " + banco.getTelefone());
		
	}

	@Override
	public void corpo(Banco banco) {
		System.out.println("\nCORPO: ");
		for (Conta conta : banco.getContas()) {			
			System.out.println("TITULAR: " + conta.getTitular()
			                  + " - SALDO CONTA: " + conta.getSaldo());
		}
	}

	@Override
	public void rodape(Banco banco) {
		System.out.println("\nRODAPE: ");
		System.out.println("BANCO: " + banco.getNome() 
						+ " - TELEFONE: " + banco.getTelefone());
		System.out.println("----------------------------------------------------------------------------------------------------------");		
	}

	@Override
	public void imprime(Banco banco) {

		System.out.println("\n[ Relatório Simples ]\n");
		this.cabecalho(banco);
		this.corpo(banco);
		this.rodape(banco);
	}
}
