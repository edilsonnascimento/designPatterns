package chainOfResponsibility.banco;

public class TestaRespostaFormato {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1500, "Edilson do Nascimento");
		Requisicao req = new Requisicao(Formato.PORCENTO);
		
		FormatoRequerido formatoRequerido = new FormatoRequerido();
		
		formatoRequerido.verifica(req, conta);
		
	}

}
