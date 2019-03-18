package templateMethod.relatorio;

public abstract class Relatorio {
	
	public abstract void cabecalho(Banco banco);
	
	public abstract void corpo(Banco banco);
	
	public abstract void rodape(Banco banco);
	
	public abstract void imprime(Banco banco);	

}
