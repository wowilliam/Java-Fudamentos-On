package com.fiap.view;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class TestCollections {
    public static void main(String[] args) {
    	
    	
      //  ArrayList<Object> carrinho = new ArrayList<>();
      //  Double valor = 100.55;
      //  int valor2 = 1;
      //  int valor3;

      //  carrinho.add(valor);
      //  carrinho.add("Uva");
      // carrinho.add(valor2);

      // System.out.println(carrinho.get(1));
 
   // 	 List<String> carrinho = new ArrayList<String>();

    //     System.out.println(carrinho.isEmpty());

    //     carrinho.add("Maça");
    //      carrinho.add("Morango");
    //      carrinho.add("Maça");

    //      System.out.println(carrinho.contains("Maça"));
    //      System.out.println(carrinho.indexOf("Maça"));
    //      System.out.println(carrinho.get(carrinho.indexOf("Maça")));
    //     System.out.println(carrinho.lastIndexOf("Maça"));
   
    
     //	   Set<String> cesta = new HashSet<String>();

     //     System.out.println(cesta.isEmpty());

     //       cesta.add("Maça");
     //      cesta.add("Maça");
     //       cesta.add("Maça");
     //      System.out.println(cesta.isEmpty());

     //      System.out.println(cesta.size());
     //       System.out.println(cesta);
       
           
           
           
    	 Map<String, String> caixa = new HashMap<String, String>();
         caixa.put("M2225", "Fernando");
         caixa.put("M2226", "Maria");
         caixa.put("M2227", "João");

         System.out.println(caixa.isEmpty());
         System.out.println(caixa.size());
         System.out.println(caixa.containsKey("M2225"));
         System.out.println(caixa.containsValue("Maria"));
         System.out.println(caixa);
    
    
    }
    
       
    
        
    }
