/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tdstecnologia.fernando;

import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class InformarMaiorValor27 {
    public static void main(String[] args) {
        
        String valorstringx = JOptionPane.showInputDialog("Insira um número inteiro(x)  : ");
        
        String valorstringy = JOptionPane.showInputDialog("Insira um número inteiro(y)  : ");
        
        Integer valorx = Integer.valueOf(valorstringx);
        
        Integer valory = Integer. valueOf(valorstringy);
        
        
        if (Objects.equals(valorx, valory)) {
            
            JOptionPane.showMessageDialog(null, valorx + " " + "Igual" + " " + valory);
            
        } else if (valorx > valory) {
            JOptionPane.showMessageDialog(null, valorx + " " + "Maior" + " " + valory);
            
        } else {
            JOptionPane.showMessageDialog(null, valory + " " + "Maior" + " " + valorx);
        }
        
        
    }
}
