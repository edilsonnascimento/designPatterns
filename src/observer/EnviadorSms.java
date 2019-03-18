package observer;

import builder.NotaFiscal;

public class EnviadorSms implements AcaoNotaFiscal{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("NOTA ENVIADA POR SMS, ENVIADO COM SUCESSO! \n");
	}

}
