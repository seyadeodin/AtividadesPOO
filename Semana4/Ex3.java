package Semana4;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o primeiro valor:");
        int valor1 = input.nextInt();
        
        System.out.println("Insira o segundo valor:");
        int valor2 = input.nextInt();
        
        System.out.println("A soma entre os svalores é" + RetornarSoma(valor1, valor2));
    }
    
    private static int RetornarSoma(int numero1, int numero2) {
        int soma = numero1 + numero2;
        return soma;
    }
}
