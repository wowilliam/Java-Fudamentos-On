package com.java;

public class Teste {
    public static void main(String[] args) {
    	
        Cliente cliente = new Cliente("Jo�o", 30);
        ContaCorrente cc = new ContaCorrente(123, 1000, cliente, "PF", 500);
        System.out.println("Saldo dispon�vel: " + cc.getSaldoDisponivel());
        cc.retirar(200);
        System.out.println("Saldo dispon�vel ap�s retirada: " + cc.getSaldoDisponivel());
    }
}
