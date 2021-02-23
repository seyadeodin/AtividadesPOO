package Semana2;

import javax.swing.JOptionPane;

public class Atividade1 {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Este código testará se um valor é múltiplo de 3", "Calculadora de 3", JOptionPane.INFORMATION_MESSAGE);
        String valor = JOptionPane.showInputDialog("Insira um valor:");
        int conversao = Integer.parseInt(valor)%3;
        
        if (conversao == 0) {
            JOptionPane.showMessageDialog(null, "Este número é múltiplo de 3!", "Número múltiplo", JOptionPane.INFORMATION_MESSAGE );
        } else { 
            JOptionPane.showMessageDialog(null, "Este número não é múltiplo de 3!", "Número não múltiplo", JOptionPane.INFORMATION_MESSAGE );
        }
            
    }
    
}
