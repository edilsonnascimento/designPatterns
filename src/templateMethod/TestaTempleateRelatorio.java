package templateMethod;

import templateMethod.relatorio.BancoDeDados;
import templateMethod.relatorio.RelatorioComplexo;
import templateMethod.relatorio.RelatorioSimples;

public class TestaTempleateRelatorio {
	
	public static void main(String[] args) {
		
		BancoDeDados dadosDoBanco = new BancoDeDados();
				
		RelatorioSimples rs = new RelatorioSimples();
		rs.imprime(dadosDoBanco.inicializa());
		
		RelatorioComplexo rc = new RelatorioComplexo();
		rc.imprime(dadosDoBanco.inicializa());

	}

}
