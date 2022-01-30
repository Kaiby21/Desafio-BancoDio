package Banco;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Carlos");
		
		cc.setTitular(cliente1);
		cc.depositar(100);
		cc.transferir(80, poupanca);

		
		cc.imprimirExtrato();		
		poupanca.imprimirExtrato();
		System.out.println("Titular da conta corrente: "+cc.getTitular().getNome());
	}

}

