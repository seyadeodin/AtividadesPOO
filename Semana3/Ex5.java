package Semana3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        try{
            int limiteSuperior, valor = 0, incremento = 1;
            Scanner input = new Scanner(System.in);

            System.out.println("Insira o limite superior");
            limiteSuperior = input.nextInt();

            System.out.println("Insira o incremento");
            incremento = input.nextInt();

             while(valor < limiteSuperior){
                 System.out.println(valor);
                 valor += incremento;
             }
        }  catch(Exception e) {
            System.out.println("Insira um valor válido!");
        }
        
    }
    
}
