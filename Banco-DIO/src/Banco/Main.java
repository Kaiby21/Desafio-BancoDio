package Banco;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		
		cc.depositar(100);
		cc.transferir(80, poupanca);
		cc.imprimirExtrato();
		
		poupanca.imprimirExtrato();
	}

}
