package com.fiap.view;

public class Comparacao {
	
    public static void main(String[] args) {
    	
    	
        String nome = new String("maça");
        String nome2 = new String("Maça");
        String nome3 = new String("maça");

        System.out.println(nome.equals(nome2));
        System.out.println(nome.equalsIgnoreCase(nome2));
        System.out.println(nome.equals(nome3));

        boolean teste = (nome == nome3);
        System.out.println(teste);

        String nome4 = "maça";
        String nome5 = "maça";

        teste = (nome == nome5);
        System.out.println(teste);
    }
}

