package com.fiap.view;

import com.fiap.entity.Produto;

public class Caixa {
	
	public static void main(String[] args) {
		
	//	int qtdProdutos = 5;
	//	int registro = 0;
		
	//	while (registro < qtdProdutos) {
	//		registro++;
	//		System.out.println("O produto número " + registro + " foi registrado");;
	//	}
		
	//	do {
	//		registro++;
	//		System.out.println("O caixa registrou o produto " + registro);
	//	} while (registro < qtdProdutos);
	   
	//	for (int i = 1; i <= qtdProdutos; i++) {
	//		System.out.println("O caixa registrou o produto " + i);
		
		Produto[] produtos = new Produto[2];
		
		Produto prod1 = new Produto();
		prod1.setNome("Limão");
		prod1.setDescricao("Galego");
		prod1.setValor(4);
		
		Produto prod2 = new Produto();
		prod2.setNome("Maça");
		prod2.setDescricao("Gala");
		prod2.setValor(5);
		
		produtos[0] = prod1;
		produtos[1] = prod2;
		
		
		for(Produto prod: produtos) {
			System.out.println(prod.toString());}
		}
	
	}
	
	
    //  Produto[][] localizacaoProduto = new Produto [10][3];
      
    //  localizacaoProduto[0][1] = prod1;
    //  localizacaoProduto[0][1] = prod2;
      
    //  System.out.println( localizacaoProduto[0][1].getNome());

