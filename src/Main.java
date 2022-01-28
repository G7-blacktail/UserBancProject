
public class Main {

	public static void main(String[] args) {

		
		Cliente Gustavo = new Cliente(null, 27);
		Gustavo.setNome("Gustavo");
		
		Iconta cc = new ContaCorrente(Gustavo);
		Iconta cp = new ContaPoupanca(Gustavo);
		cc.depositar(100);
		cp.depositar(100);
		cc.transferir(50, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
