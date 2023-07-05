package com.java;

public class ContaCorrente extends Conta {
    private String tipo;
    private double chequeEspecial;

    public ContaCorrente(int numero, double saldo, Cliente cliente, String tipo, double chequeEspecial) {
        super(numero, saldo, cliente);
        this.tipo = tipo;
        this.chequeEspecial = chequeEspecial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldoDisponivel() {
        return getSaldo() + chequeEspecial;
    }

    @Override
    public void retirar(double valor) {
        valor += 10;
        super.retirar(valor);
    }
}
