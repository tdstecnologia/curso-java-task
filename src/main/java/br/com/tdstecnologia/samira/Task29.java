/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tdstecnologia.samira;

/**
 *
 * @author Aluno1
 */
import java.util.Objects;
import javax.swing.JOptionPane;

public class Task29 {

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
