package br.com.fiap.banco;

public class Conta {

	int numero;
	int agencia;
	private double saldo;

	public Conta(){

	}

	public Conta(int numero, int agencia, double saldo){
		this.numero = numero;
		this.agencia = agencia;
		this.setSaldo(saldo);
	}

	public void depositar(double valor){
		this.setSaldo(this.getSaldo() + valor);
	}

	public void retirar(double valor){
		this.setSaldo(this.getSaldo() - valor);
	}

	public double verificarSaldo(){
		return getSaldo();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}