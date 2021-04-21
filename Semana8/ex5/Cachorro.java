package Semana8.ex5;

public class Cachorro extends Animal {
    private String raca, nome;

    public Cachorro() {
        super();
        this.raca = "";
        this.nome = "";
    }

    public String getRaca() {
        return raca;
    }

    public String getNome() {
        return nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }
    
    
    
}
