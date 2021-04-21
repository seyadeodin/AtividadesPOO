package Semana8;

public class TesteFaturar {
     
    public static void main(String[] args) {

        Faturar Faturar = new Faturar();
        Faturar.setItemQuantidade(2);
        Faturar.setItemPrecoUn(32.50);

        System.out.print("O valor total é " + Faturar.getFaturarTotal());

  }
  
}

