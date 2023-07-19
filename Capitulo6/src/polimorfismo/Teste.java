package polimorfismo;

public class Teste {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrenteEspecial();
		
		try {
			conta.sacar(20);
		}catch (SaldoInsuficenteException e) {
			e.printStaticTrace();
		}
	}

}
