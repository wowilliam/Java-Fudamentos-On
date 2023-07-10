package com.fiap.view;

public class Caixa {
	
	public static void main(String[] args) {
		
		int qtdProdutos = 5;
		int registro = 0;
		
	//	while (registro < qtdProdutos) {
	//		registro++;
	//		System.out.println("O produto númeor " + registro + " foi registrado");;
	//	}
		
		do {
			registro++;
			System.out.println("O caixa registrou o produto " + registro);
		} while (registro < qtdProdutos);
	}

}
