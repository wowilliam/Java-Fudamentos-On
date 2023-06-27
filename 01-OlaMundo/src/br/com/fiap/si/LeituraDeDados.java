package br.com.fiap.si;
import java.util.Scanner;

public class LeituraDeDados {
	
	public static void main (String[] args) {
		
		int idade = 35;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digete o nome: ");
		String nome = sc.next();
		
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		
		if (idade < 0)
			System.out.println("Idade inválida ");
		
		if (idade >= 18 && idade < 70) {
			System.out.println("Maior idade ");
		}else if (idade >= 70) {
			
			System.out.println("Terceira idade");
			if (idade >= 100) {
				System.out.println("Centenário");
			}
		}
	}

}
