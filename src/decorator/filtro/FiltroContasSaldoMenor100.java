package decorator.filtro;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroContasSaldoMenor100 extends Filtro{
	
		public FiltroContasSaldoMenor100() {
	}
	
	public FiltroContasSaldoMenor100(Filtro outroFiltro) {
		super.outroFiltro = outroFiltro;
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		
		List<Conta> contasFiltradas;
		
		contasFiltradas = contas.stream()
 	                 .filter(c -> c.getSaldo() < 100)
	                 .collect(Collectors.toList());
		
	    if (! contasFiltradas.isEmpty()) return contasFiltradas;
	    
	    return super.proximoFiltro(contas); 
	}	
	

}
