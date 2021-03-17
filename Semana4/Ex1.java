package Semana4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
       
        System.out.println("Insira um valor:");
        numero = input.nextInt();
        
        numero = retornarDobro(numero);
        System.out.println("O dobro do valor é " + numero);
    }
    
    private static int retornarDobro(int numero) {
       int dobro = numero*2;
       return dobro;
    }
}
