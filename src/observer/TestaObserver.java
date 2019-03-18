package observer;

import java.time.LocalDate;
import java.time.Month;

import builder.ItemNotaFiscal;
import builder.NotaFiscal;

public class TestaObserver {
	
	public static void main(String[] args) {
		
		BuilderNotaFiscal builderNotaFiscal = new BuilderNotaFiscal();
		
		builderNotaFiscal
			.adicionaAcaoNotaFiscal(new NotaFiscalDAO())
			.adicionaAcaoNotaFiscal(new EnviadorEmail())
			.adicionaAcaoNotaFiscal(new Impressora())
			.adicionaAcaoNotaFiscal(new EnviadorSms())
			.paraEmpresa("Grupo Expoente")
		    .comCnpj("75.458.362/0001-89")
		    .emitidoNa(LocalDate.of(2019, Month.JANUARY, 31))
		    .com(new ItemNotaFiscal("Apostila do 1 Ano", 500.0))
		    .com(new ItemNotaFiscal("Apostila do 2 Ano", 500.0))
		    .com(new ItemNotaFiscal("Apostila do 3 Ano", 500.0))
		    .comObervacao("adicionar EduColaborativo na negociação");
      
       NotaFiscal nf = builderNotaFiscal.constroi();
       
       System.out.println(nf);       

	}

}
