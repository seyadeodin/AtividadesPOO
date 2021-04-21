package Semana8.ex6;

public class Pessoa {
    private int idade, altura;
    private String nome, sexo;
    
    public Pessoa(){
        this.idade = 0;
        this.altura = 0;
        this.nome = "";
        this.sexo = "";
    }

    public int getIdade() {
        return idade;
    }

    public int getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
