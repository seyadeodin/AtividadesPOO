
package Semana8;

public class Faturar {

    private int itemFaturado;
    private int itemQuantidade;
    private double itemPrecoUn;
    private String itemDescricao;

    public void Faturar (){
        itemFaturado = 0;
        itemQuantidade = 0;
        itemPrecoUn = 0;
        itemDescricao = "";
    }

    public int getItemFaturado() {
        return itemFaturado;
    }

    public int getItemQuantidade() {
        return itemQuantidade;
    }

    public double getItemPrecoUn() {
        return itemPrecoUn;
    }

    public String getItemDescricao() {
        return itemDescricao;
    }

    public void setItemFaturado(int itemFaturado) {
        this.itemFaturado = itemFaturado;
    }

    public void setItemQuantidade(int itemQuantidade) {
        this.itemQuantidade = itemQuantidade;
    }

    public void setItemPrecoUn(double itemPrecoUn) {
        this.itemPrecoUn = itemPrecoUn;
    }

    public void setItemDescricao(String itemDescricao) {
        this.itemDescricao = itemDescricao;
    }
    
    public double getFaturarTotal() {
        double totalFatura = this.itemQuantidade*this.itemPrecoUn;
        return totalFatura;
    }
    
    
    
}
