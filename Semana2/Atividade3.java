package Semana2;

import javax.swing.JOptionPane;

public class Atividade3 {
    
    public static void main(String[] args) {
    
        String valorS = JOptionPane.showInputDialog("Insira o valor do produto");
        float valorN = Float.parseFloat(valorS);
        
        float valorF;
        
        if (valorN<20) {
            valorF =  (float) (valorN + valorN*0.45);
        } else {
           valorF =  (float) (valorN + valorN*0.35); 
        }
        
        JOptionPane.showMessageDialog(null, "O valor final final do produto é de " + valorF);
               
    }
    
}
