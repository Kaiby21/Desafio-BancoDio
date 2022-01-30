package Banco;

public abstract class Conta implements IConta{
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	protected int agencia;
	protected int conta;
	protected double saldo;
	private Cliente titular;
	
	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
	}
	
	@Override
	public void sacar(double valor) {
			// TODO Auto-generated method stub
		this.saldo -= valor;	
	}

	@Override
	public void depositar(double valor) {
			// TODO Auto-generated method stub
		this.saldo += valor;	
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
			// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
			
	}	
		
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
		
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.conta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}
	
	

}
