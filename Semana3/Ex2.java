package Semana3;

import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        int i = 1;
        int fibonacci = 1;
        int fibonnaciAnt = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o número de termos de Fibonnaci:");
        int nInformado = input.nextInt();
        
        System.out.println(fibonacci);
        while(i < nInformado) {
            fibonacci = fibonacci + fibonnaciAnt;
            fibonnaciAnt = fibonacci-fibonnaciAnt;
            System.out.println(fibonacci);
            i++;
        }
        
    }
    
}
