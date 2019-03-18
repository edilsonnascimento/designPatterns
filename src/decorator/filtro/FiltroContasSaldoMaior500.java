package decorator.filtro;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroContasSaldoMaior500 extends Filtro{

	
	public FiltroContasSaldoMaior500() {
	}
	
	public FiltroContasSaldoMaior500(Filtro outroFiltro) {
		super.outroFiltro = outroFiltro;
	}
	
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		
		List<Conta> contasFiltradas;
		
		contasFiltradas = contas.stream()
				          .filter(c -> c.getSaldo() > 500)
				          .collect(Collectors.toList());
		
		if (! contasFiltradas.isEmpty()) return contasFiltradas;
		
		return super.proximoFiltro(contas);
	}

}
