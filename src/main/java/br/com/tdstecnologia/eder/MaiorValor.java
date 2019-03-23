package br.com.tdstecnologia.eder;

import javax.swing.JOptionPane;

public class MaiorValor {

    /*
    Informar o maior valor
    
    Faça um sistema que verifique qual o maior valor de 2 números informados e apresente a mensagem
    x maior y
    x igual y */
    
    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog("Adicione o valor X");
        String y = JOptionPane.showInputDialog("Adicione o valor Y");
        Integer x1 = Integer.valueOf(x);
        Integer y1 = Integer.valueOf(y);
        if (x1 > y1) {
            JOptionPane.showMessageDialog(null, "X é maior que Y");
            if (x1 == y1) {
                JOptionPane.showMessageDialog(null, "X é igual à Y");
            }
        }
    }

}
