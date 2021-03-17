package Semana4;

import java.util.Scanner;

public class Ex2 {
        public static void main(String[] args) {
        int soma = 0;
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Insira um valor");
            soma += input.nextInt();
        }
        
        int media = retornarMedia(soma);
        System.out.println("A média entre os números é de " + media);
        
    }
    
    private static int retornarMedia(int numero) {
       int media = numero/4;
       return media;
    }
}
