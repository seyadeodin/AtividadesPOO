package Semana1;

import java.util.Scanner;

public class Atividade1 {
    
    public static void main(String[] args){
        float v100, v90;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o nome do produto: \n");
        String productName = input.nextLine();
        System.out.println("Insira o valor do produto: \n");
        v100 = input.nextFloat();
        v90 = (float) (v100 - (0.09*v100));
        System.out.printf("%s sairá por %f com os descontos.", productName, v90);
    }
    
}
