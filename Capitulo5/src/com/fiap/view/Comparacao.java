package com.fiap.view;

public class Comparacao {
	
    public static void main(String[] args) {
    	
    	
        String nome = new String("ma�a");
        String nome2 = new String("Ma�a");
        String nome3 = new String("ma�a");

        System.out.println(nome.equals(nome2));
        System.out.println(nome.equalsIgnoreCase(nome2));
        System.out.println(nome.equals(nome3));

        boolean teste = (nome == nome3);
        System.out.println(teste);

        String nome4 = "ma�a";
        String nome5 = "ma�a";

        teste = (nome == nome5);
        System.out.println(teste);
    }
}

