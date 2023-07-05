package com.java;

public class TesteConta {
    public static void main(String[] args) {
        Cliente clienteCorrente = new Cliente("Leandro", 45);
        Cliente clientePoupanca = new Cliente("JOSE", 26);
        Cliente clienteInvestimento = new Cliente("Maria", 37);

        Conta contaCorrente = new Conta(11, 20.5, clienteCorrente);
        Conta contaPoupanca = new Conta(22, 30, clientePoupanca);
        Conta contaInvestimento = new Conta(33, 40, clienteInvestimento);

        System.out.println(contaCorrente.getNumero());
        System.out.println(contaCorrente.getSaldo());
        System.out.println(contaCorrente.getCliente().getNome());
        System.out.println(contaCorrente.getCliente().getIdade());
    }
}
