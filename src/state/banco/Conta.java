package state.banco;

public class Conta {
	
    protected double saldo;
    protected EstadoConta estado;

    public Conta(){
        estado = new Positivo();
    }

    public void saca(double valor) {
        estado.saca(this, valor);
    }

    public void deposita(double valor) {
        estado.deposita(this, valor);
    }
    
    public double getSaldo() {
    	return this.saldo;
    }
    
    public EstadoConta getEstadoConta() {
    	return this.estado;
    }

}
