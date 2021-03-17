package Semana3;

import java.util.Scanner;

public class Ex3 {
        public static void main(String[] args) {
        int nPrimo, nInformado1, nInformado2;
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("Insira o primeiro numero do intervalo:");
            nInformado1 = input.nextInt();

            System.out.println("Insira o segundo numero do intervalo:");
            nInformado2 = input.nextInt();



            for(int i = nInformado1; i < nInformado2; i++){
                if(checarPrimo(i)) {
                  System.out.println(i);
                }
            }         
        }  catch(Exception e) {
            System.out.println("Insira um valor válido!");
        }
    }
    private static boolean checarPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
}
