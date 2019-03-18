package observer;

import builder.NotaFiscal;

public class NotaFiscalDAO implements AcaoNotaFiscal{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("NOTA SALVA NO BANCO DE DADOS COM SUCESSO!!!");

	}
	

}
