package br.com.fiap.banco;

public class Conta {

	private int numero;
	private int agencia;
	private double saldo;

	public Conta() {

	}

	public Conta(int numero, int agencia, double saldo) {
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.setSaldo(saldo);
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public void retirar(double valor) {
		saldo = saldo - valor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
