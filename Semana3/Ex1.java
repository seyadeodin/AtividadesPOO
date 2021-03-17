package Semana3;

import java.util.Scanner;

public class Ex1 {
  
    public static void main(String[] args) {       
        int nPar, nInformado1, nInformado2;
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.println("Insira o primeiro numero do intervalo:");
            nInformado1 = input.nextInt();

            System.out.println("Insira o segundo numero do intervalo:");
            nInformado2 = input.nextInt();

            while(nInformado1 < nInformado2){
                nInformado1++;
                if(nInformado1%2 == 0) {
                    System.out.println(nInformado1);
                }
            }
        }  catch(Exception e) {
            System.out.println("Insira um valor válido!");
        }
    }
 
    
}
