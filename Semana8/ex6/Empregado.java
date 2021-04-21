/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8.ex6;

public class Empregado extends Pessoa {
    private double salario;
    
    public Empregado() {
        super();
        this.salario = 0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double obterLucros(){
        double salarioAnual = this.salario*12;
        return salarioAnual;
    }
}
