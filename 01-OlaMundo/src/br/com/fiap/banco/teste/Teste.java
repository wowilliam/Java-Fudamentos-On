package br.com.fiap.banco.teste;

import br.com.fiap.banco.Conta;

public class Teste {
	public static void main(String[] args) {
		
		Conta cc = new Conta();
        cc.setSaldo(1000);
        cc.depositar(100);
        cc.verificarSaldo();

        double valor = cc.getSaldo();
        System.out.println(cc.getSaldo());
    }

}