package br.com.fiap.si;

public class OperadorLogico {
	
	public static void main (String[] args) {
		
		int idade = 20;
		boolean precisaVotar = idade >= 18 &&  idade < 70;
		
		System.out.println(precisaVotar);
	}

}
