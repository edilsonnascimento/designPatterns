package observer;

import builder.NotaFiscal;

public class Impressora implements AcaoNotaFiscal{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		
		System.out.println("NOTA IMPRESSA COM SUCESSO!!!");
	}

}
