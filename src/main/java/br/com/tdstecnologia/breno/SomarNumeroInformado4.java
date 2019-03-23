package br.com.tdstecnologia.breno;

import javax.swing.JOptionPane;


public class SomarNumeroInformado4 
{
    public static void main(String[] args) 
    {
        String numero = JOptionPane.showInputDialog("Insira um número: ");
        Integer x = Integer.valueOf(numero);
        Integer soma = 0;
        System.out.println("Valor digitado: " + x);        
        
        for (int y = 0; y < x; y++ )
        {
            soma = soma + y;
        }
        
        JOptionPane.showMessageDialog(null, "O resultado é " + soma);
        System.out.println("O resultado é " + soma);
        
    }
    
}
