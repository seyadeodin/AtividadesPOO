/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8.ex6;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado Empregado1 = new Empregado();
        Empregado1.setAltura(169);
        Empregado1.setIdade(26);
        Empregado1.setNome("Juliana");
        Empregado1.setSalario(1376.75);
        
        System.out.println("Nome: " + Empregado1.getNome() +
                "\nIdade: " + Empregado1.getIdade() +
                "\nAltura: " + Empregado1.getAltura() +
                "\nLucros: " + Empregado1.obterLucros());
    }
}
