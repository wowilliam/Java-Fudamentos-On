package br.com.fiap.si;

public class FluxoControle {
	
	public static void main (String[] args) {
		
		int idade = 80;
		
		if (idade >= 18 && idade < 70) {
			System.out.println("Maior idade");
		} else if (idade >= 70 ) {
			System.out.println("Terceira idade");
		} else {
			System.out.println("Menor idade");
		}
	}

}
