package Semana4;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        MostarValorMaior();
        
    }
    
    private static void MostarValorMaior() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro valor:");
        int valor1 = input.nextInt();
        System.out.println("Insira o segundo valor");
        int valor2 = input.nextInt();
        String maior = valor1 > valor2 ? "O maior valor é " + valor1 : "O maior valor é " + valor2;
        System.out.print(maior);
    }
    
}
