package Semana8;

public class TesteEmpregado {
     
    public static void main(String[] args) {

        Empregado Empregado1 = new Empregado();
        Empregado1.setSalarioMensal(1000);
        Empregado1.setSalarioAumento();
        System.out.println("Seu salário anual é " + Empregado1.getSalarioAnual());
        
        Empregado Empregado2 = new Empregado();
        Empregado2.setSalarioMensal(200);
        Empregado2.setSalarioAumento();
        System.out.println("Seu salário anual é " + Empregado2.getSalarioAnual());

  }
  
}

