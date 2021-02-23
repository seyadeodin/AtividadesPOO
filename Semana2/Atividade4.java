package Semana2;

import javax.swing.JOptionPane;

public class Atividade4 {
    
    public static void main(String[] args){
        String valorS = JOptionPane.showInputDialog("Insira a sua idade:");
        float valorN = Integer.parseInt(valorS);
        
        if (valorN < 16) {
            JOptionPane.showMessageDialog(null, "Não-eleitor");
        }
        if (valorN >= 18 && valorN <= 65){
            JOptionPane.showMessageDialog(null, "Eleitor Obrigatório");
        }
        if (valorN >= 16 && valorN < 18 || valorN > 65){
            JOptionPane.showMessageDialog(null, "Eleitor Facultativo");
        }
        
    
    }
}
