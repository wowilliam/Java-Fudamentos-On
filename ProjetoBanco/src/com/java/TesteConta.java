package com.java;

public class TesteConta {

    public static void main(String[] args) {

        Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.numero = 11;
        contaCorrente.saldo = 20.5;
        contaCorrente.cliente = new Cliente();
        contaCorrente.cliente.nome = "Leandro";
        contaCorrente.cliente.idade = 45;

        contaPoupanca.numero = 22;
        contaPoupanca.saldo = 30;
        contaPoupanca.cliente = new Cliente();
        contaPoupanca.cliente.nome = "JOSE";
        contaPoupanca.cliente.idade = 26;


        contaInvestimento.numero = 33;
        contaInvestimento.saldo = 40;
        contaInvestimento.cliente = new Cliente();
        contaInvestimento.cliente.nome = "Maria";
        contaInvestimento.cliente.idade = 37;


        System.out.println(contaCorrente.numero);
        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.cliente.nome);
        System.out.println(contaCorrente.cliente.idade);
    }
}

