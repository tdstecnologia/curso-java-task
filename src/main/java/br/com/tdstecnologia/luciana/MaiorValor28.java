
package br.com.tdstecnologia.luciana;

import java.util.Objects;
import javax.swing.JOptionPane;

public class MaiorValor28 {
        

    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog("Adicione o valor X");
        String y = JOptionPane.showInputDialog("Adicione o valor Y");
        Integer x1 = Integer.valueOf(x);
        Integer y1 = Integer.valueOf(y);
        if (x1 > y1) {
            JOptionPane.showMessageDialog(null, "X é maior que Y");
            if (Objects.equals(x1, y1)) {
                JOptionPane.showMessageDialog(null, "X é igual à Y");
            }
        }
    }

}