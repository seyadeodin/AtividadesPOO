package Semana4;

import java.util.Scanner;

public class Ex6 {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Leitor de Meses: 1 Trimestre\n Insira o número do mês:");
    int mes =  input.nextInt();
    
    MostraMes(mes);
            
    }
    
    private static void MostraMes(int mes) {
        String mesNome;
        switch(mes){
            case 1:
                mesNome = "Janeiro";
                break;
            case 2:
                mesNome = "Fevereiro";
                break;
            case 3:
                mesNome = "Março";
                break;
            default:
                mesNome = "Mês inválido";         
        }
        System.out.println("O númeor que você escolheu corresponde ao mês de " + mesNome);
    }

    
}
