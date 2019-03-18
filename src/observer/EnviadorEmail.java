package observer;

import builder.NotaFiscal;

public class EnviadorEmail implements AcaoNotaFiscal{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("NOTA ENVIADA POR E-MAIL COM SUCESSO!!!");

	}

}
