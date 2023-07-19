package polimorfismo;

public class ContaCorrenteEspecial extends ContaCorrente{
	
	private double limite;
	
	public void sacar(double valor) throws SaldoInsuficinteException {
		if (valor > saldo + limite) {
			throw new SaldoInsuficienteExecption();
		}
		saldo = saldo - valor;
	}

}
