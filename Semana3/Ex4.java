package Semana3;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float p1, p2, p3, media;
        
        try{
        System.out.println("Insira a nota da P1:");
        p1 = input.nextFloat();
        
        System.out.println("Insira a nota da P2:");
        p2 = input.nextFloat();
        
        System.out.println("Insira a nota da Semana da Tecnologia:");
        p3 = input.nextFloat();
        
        media = calcNota(p1, p2, p3);
        
        System.out.printf("A média do aluno foi de %.2f", media);
        } catch(Exception e) {
            System.out.println("Insira um valor válido!");
        }
        
    }
    private static float calcNota(float p1,float p2,float p3) {
        float media = ((p1+p2-2)/2)+p3;
        return media;
    }
}
