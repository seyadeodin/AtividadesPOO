/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8.ex5;

public class Cocker extends Cachorro {
    boolean tosa;

    public Cocker() {
        super();
        tosa = tosa;
    }

    public boolean isTosa() {
        return tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }
    
    public String estaTosado() {
        if (tosa)
            return "Está tosado";
        else
            return "Não está tosado";
                    
    }
    
}
