package Semana2;

import javax.swing.JOptionPane;

public class Atividade5 {
    
    public static void main(String[] args){
        
        String nome = JOptionPane.showInputDialog("Insira o seu nome:");
        String valorS = JOptionPane.showInputDialog("Insira a sua idade:");
        float valorN = Integer.parseInt(valorS);
        
        if (valorN <= 10) {
            JOptionPane.showMessageDialog(null, "Você pagará 30,00");
        }
        if (valorN > 10 && valorN <= 29){
            JOptionPane.showMessageDialog(null, "Você pagará 60,00");
        }
        if (valorN > 29 && valorN <= 45){
            JOptionPane.showMessageDialog(null, "Você pagará 120,00");
        }
        if (valorN > 45 && valorN <= 59){
            JOptionPane.showMessageDialog(null, "Você pagará 150,00");
        }
        if (valorN > 59 && valorN <= 65){
            JOptionPane.showMessageDialog(null, "Você pagará 250,00");
        }
        if (valorN > 65){
            JOptionPane.showMessageDialog(null, "Você pagará 4000,00");
        }
        
    }
}
