package Semana1;

import java.util.Scanner;

public class Atividade2 {
    
    public static void main(String[] args){
        float sMinimo, sPessoa, pessoaMinimo;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o valor do salário mínimo \n");
        sMinimo = input.nextFloat();
        System.out.print("Insira o salário da pessoa: \n");
        sPessoa = input.nextFloat();
        pessoaMinimo = sPessoa/sMinimo;
        System.out.printf("A pessoa ganha aproximadamente %f salários mínimos", pessoaMinimo);
    }
    
}
