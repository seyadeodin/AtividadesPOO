package Semana8.ex5;

import javax.swing.JOptionPane;

public class TesteCachorro {
    public static void main(String[] args) {

        Cocker Cachorro1 = new Cocker();
        
        String tipo = JOptionPane.showInputDialog(null, "Insira o tipo");
        Cachorro1.setTipo(tipo);
        JOptionPane.showMessageDialog(null, Cachorro1.getTipo());
        
        String cor = JOptionPane.showInputDialog(null, "Insira a cor");
        Cachorro1.setCor(cor);
        JOptionPane.showMessageDialog(null, Cachorro1.getCor());
        
        String raca = JOptionPane.showInputDialog(null, "Insira a raça");
        Cachorro1.setRaca(raca);
        JOptionPane.showMessageDialog(null, Cachorro1.getRaca());
        
        String nome = JOptionPane.showInputDialog(null, "Insira o nome");
        Cachorro1.setNome(nome);
        JOptionPane.showMessageDialog(null, Cachorro1.getNome());
        
        int tosa = JOptionPane.showConfirmDialog(null, "Ele está tosado?");  
        if (tosa == 0){  
           Cachorro1.setTosa(true);
        }
        if (tosa == 2) {
            Cachorro1.setTosa(false);
        }

        JOptionPane.showMessageDialog(null, "Tipo: " + Cachorro1.getRaca() + "\n" + "Cor: " + Cachorro1.getCor() + "\n"
        + "Raça: " + Cachorro1.getRaca() + "\nNome: " + Cachorro1.getNome() + "\n" + Cachorro1.estaTosado());

  }
}
