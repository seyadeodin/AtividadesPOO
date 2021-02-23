package Semana1;

import java.util.Scanner;

public class Atividade3 {
    
    public static void main(String[] args) {
        float v1, v2, media;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o valor 1:");
        v1 = input.nextFloat();
        System.out.println("Insira o valor 2:");
        v2 = input.nextFloat();
        media = (v1+v2)/2;
        System.out.printf("A média entre os valores 1 e 2 é %f", media);
        
    }
}
