package com.fiap.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {
    
    public static void main(String[] args) {
    	
        String nomeArquivo = "estoque.csv";
        String diretorio = System.getProperty("user.home");
        String caminho = diretorio + "\\" + nomeArquivo;
        
        List<String> conteudo = new ArrayList<>();
        conteudo.add("Produto; Quantidade; unidade de Medida; Valor da Unidade");
        conteudo.add("Pera; 200; pct; R$ 5,40;");
        conteudo.add("Morango; 400; cx; R$ 6,50");
        conteudo.add("Abacaxi; 200; un; R$ 5,00");
        
        gravarEstoque(nomeArquivo, caminho, conteudo);
        
        // Chama a função para ler o estoque a partir do arquivo
        lerEstoque(caminho);
    }
    
    public static void gravarEstoque(String nomeArquivo, String caminho, List<String> conteudo) {
        FileWriter stream;
        PrintWriter print;

        try {
            stream = new FileWriter(caminho);
            print = new PrintWriter(stream);

            for (String linha : conteudo) {
                print.println(linha);
            }

            print.close();
            stream.close();

            System.out.println("O arquivo " + nomeArquivo + " foi salvo em " + caminho);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerEstoque(String caminho) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
