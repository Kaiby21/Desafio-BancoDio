package Banco;

public class ContaPoupanca extends Conta{

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("=== EXtrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}



}
