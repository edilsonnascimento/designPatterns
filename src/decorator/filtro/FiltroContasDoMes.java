package decorator.filtro;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroContasDoMes extends Filtro{
	
	public FiltroContasDoMes() {
	}
	
	public FiltroContasDoMes(Filtro outroFiltro) {
		super.outroFiltro = outroFiltro;
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		
		List<Conta> contasFiltradas;
		LocalDate mesAtual = LocalDate.now();
		
		contasFiltradas = contas.stream()
				.filter(c -> c.getDataAbertura().getMonth() == mesAtual.getMonth())
				.collect(Collectors.toList());
		
		if (! contasFiltradas.isEmpty()) return contasFiltradas;
		
		return super.proximoFiltro(contas);
	}
}
