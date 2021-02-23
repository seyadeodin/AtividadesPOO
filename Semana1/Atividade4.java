package Semana1;

import java.util.Scanner;

public class Atividade4 {
    
    public static void main(String[] args) {
        float celsius, farenheit;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira a temperatura em celsius:");
        celsius = input.nextFloat();
        farenheit = (9 * celsius + 160) / 5;
        System.out.printf("O valor em farenheit será %f", farenheit);
    }
    
}
