
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		//contrutor da classe mãe Conta
		super( agencia, numero);
	}
	
	
	
	@Override
	public boolean sacar(double valor) {
		
		// Taxa para saque:
		double valorASacar=valor+0.2;
		return super.sacar(valorASacar);
	}



	@Override
	public void deposita(double valor) {
	
		super.saldo=super.saldo+valor;
		
	}

}
