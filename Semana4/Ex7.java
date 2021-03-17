package Semana4;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Calculadora de Fatorial\n Insira o valor:");
        int numero = input.nextInt();
        
        int radiano = RetornarFatorial(numero);
        
        System.out.println("O valor em radiaanos é " + radiano);
    }
    
    public static int RetornarFatorial(int numero) {
        int radiano = numero;
        for (int i = numero-1; i > 1; i--){
            radiano *= i;
        }
        return radiano;
    }
}
