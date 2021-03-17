package Semana4;

import java.util.Scanner;

public class Ex4 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o valor em graus");
        float graus = input.nextFloat();
        
        System.out.println("Este valor em radianos é " + RetornarRadiano(graus));
    }
    
    private static float RetornarRadiano(float graus) {
        float PI = 3.14f;
        float radiano = graus * PI / 180;
        return radiano;
    }
}
