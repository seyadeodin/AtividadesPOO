
package Semana8;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora Calculadora = new Calculadora();

        double soma = Calculadora.soma(10, 2);
        System.out.println("Soma é " + soma);

        double subracao = Calculadora.subtracao(10, 2);
        System.out.println("Adição é " + subracao);
        
        System.out.println("Divisão é " + Calculadora.divisao(10, 2));
        
        System.out.println("Divisão por 0 " + Calculadora.divisao(10, 0));
        
        System.out.println("Divisão é " + Calculadora.divisao(10, 2));
        
        System.out.println("Multiplicação é " + Calculadora.multiplicacao(10, 2));
    }
}
