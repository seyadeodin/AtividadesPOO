package Semana1;

import java.util.Scanner;

public class Atividade5 {
    
    public static void main(String[] args) {
        float pi = (float) 3.14159, raio, altura, volume;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira a atlura da lata:");
        altura = input.nextFloat();
        System.out.println("Insira o raio da lata");
        raio = input.nextFloat();
        volume = pi * raio * 2 * altura;
        System.out.printf("O volume da lata de óleo é %f", volume);
        
    }

}
