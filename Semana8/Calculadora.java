package Semana8;

public class Calculadora {
   private String mensagem;
   private double numero1, numero2;
   
   public void Empregado() {
       numero1 = 0;
       numero2 = 0;
       mensagem = "";
   }
   
     public double soma(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        double result = this.numero1 + this.numero2;
        return result;
     }
     
    public double subtracao(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        double result = this.numero1 - this.numero2;
        return result;
    }
    
    public String divisao(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.mensagem = "Divisão inválida";
        double result = this.numero1 / this.numero2;
        if (numero2 == 0) {
            return this.mensagem;
        }
        return Double.toString(result);
    }
    
    public double multiplicacao(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        double result = this.numero1 * this.numero2;
        return result;
    }
    
   
}
