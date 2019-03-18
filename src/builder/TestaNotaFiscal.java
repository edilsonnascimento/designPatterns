package builder;

import java.time.LocalDate;
import java.time.Month;

public class TestaNotaFiscal {
	
	public static void main(String[] args) {
		
		BuilderNotaFiscal builderNotaFiscal = new BuilderNotaFiscal();
		
		builderNotaFiscal
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
