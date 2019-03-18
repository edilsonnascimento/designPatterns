package decorator;

import java.util.List;

import decorator.filtro.Conta;
import decorator.filtro.Filtro;
import decorator.filtro.FiltroContasDoMes;
import decorator.filtro.FiltroContasSaldoMaior500;
import decorator.filtro.FiltroContasSaldoMenor100;

public class TesteFiltro {
	
	public static void main(String[] args) {
		
		GeraLista contas = new GeraLista();
		
		Filtro contasSaldoMenor100 = new FiltroContasSaldoMenor100();
		Filtro contasSaldoMaior500 = new FiltroContasSaldoMaior500(contasSaldoMenor100);
		Filtro contasDoMesCorrente = new FiltroContasDoMes(contasSaldoMaior500);
		
		List<Conta> contasFIltradas = contasDoMesCorrente.filtra(contas.gera());
		
		System.out.println("FILTRADAS: ");
		for (Conta conta : contasFIltradas) {
			System.out.println(conta.toString());
		}
		
	}

}
