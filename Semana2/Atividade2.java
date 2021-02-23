package Semana2;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Atividade2 {
    
    public static void main(String[] args) {
        ArrayList<Integer> Valores = new ArrayList<>();
        
        for (int i= 0; i < 3; i++){
            String valor = JOptionPane.showInputDialog("Insira um valor:");
            //String valor2 = JOptionPane.showInputDialog("Insira o segundo valor:");
            //String valor3 = JOptionPane.showInputDialog("Insira o terceiro valor:");
        
        
          Valores.add(Integer.parseInt(valor));
        }
        
       Collections.sort(Valores);
       String listString = Valores.stream().map(Object::toString)
                        .collect(Collectors.joining(", "));
       
       JOptionPane.showMessageDialog(null, "Os valores em ordem crescente são" + listString );
    }
    
}
