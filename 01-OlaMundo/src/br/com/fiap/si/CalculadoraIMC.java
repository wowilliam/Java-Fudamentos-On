package br.com.fiap.si;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println("Seu IMC é: " + imc);
        if (imc >= 18.5 && imc <= 25) {
            System.out.println("Você está no peso ideal.");
        } else {
            System.out.println("Você está fora do peso normal.");
        }
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}