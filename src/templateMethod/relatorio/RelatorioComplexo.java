package templateMethod.relatorio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RelatorioComplexo extends Relatorio{
	
	
	@Override
	public void cabecalho(Banco banco) {
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println("CABEÇALHO");
		System.out.println("BANCO: " + banco.getNome() 
				           + " - TELEFONE: " + banco.getTelefone()
				           + " - ENDEREÇO: " + banco.getEndereco());
		
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
		
		LocalDateTime dataAtual = LocalDateTime.now();
		DateTimeFormatter formatador =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		
		System.out.println("\nRODAPE: ");
		System.out.println("BANCO: " + banco.getNome() 
  						   + " - TELEFONE: " + banco.getTelefone()
				           + " - ENDEREÇO: " + banco.getEndereco()
				           + " - E-MAIL: " + banco.getEmail()
				           + " - DATA ATUAL: " + dataAtual.format(formatador));
		System.out.println("----------------------------------------------------------------------------------------------------------");		
						
	}

	@Override
	public void imprime(Banco banco) {
		
		System.out.println("\n\n[ Relatório Complexo ]\n");
		this.cabecalho(banco);
		this.corpo(banco);
		this.rodape(banco);
	}
	
	

}
