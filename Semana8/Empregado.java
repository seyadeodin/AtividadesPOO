package Semana8;

public class Empregado {
   private String nome, sobrenome;
   private double salarioMensal;
   
   public void Empregado() {
       nome = "";
       sobrenome = "";
       salarioMensal = 0;
   }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalarioMensal(double salario) {
        this.salarioMensal = salario;
    }
   
    public void setSalarioAumento(){
        this.salarioMensal = this.salarioMensal + (this.salarioMensal*0.1);
    }
    
    public double getSalarioAnual() {
        double salarioAnual = this.salarioMensal*12;
        return salarioAnual;
    }
   
}
