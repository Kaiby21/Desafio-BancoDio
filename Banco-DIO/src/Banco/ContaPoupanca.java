package Banco;

public class ContaPoupanca extends Conta{

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("=== EXtrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}



}
