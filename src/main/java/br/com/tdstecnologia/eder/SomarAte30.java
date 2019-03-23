package br.com.tdstecnologia.eder;

import javax.swing.JOptionPane;

public class SomarAte30 {

    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog("Informe o valor a ser somado");
        Integer x1 = Integer.valueOf(x);

        Integer contador = 0;
        for (int i = 0; i < x1; i++) {
            contador = contador + i;
            System.out.println(+contador);
        }
        JOptionPane.showMessageDialog(null, "Total " + contador);

    }
}
