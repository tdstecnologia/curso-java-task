package br.com.tdstecnologia.breno;

import javax.swing.JOptionPane;

public class MaiorValor1 
{
    public static void main(String[] args) 
    {
        String valor1 = JOptionPane.showInputDialog(null, "Insira um número: ", "Maior valor", JOptionPane.WARNING_MESSAGE  );
        Integer x = Integer.valueOf(valor1);
        System.out.println("Valor digitado: " + x);
        
        String valor2 = JOptionPane.showInputDialog(null, "Insira outro número: ", "Maior valor", JOptionPane.WARNING_MESSAGE  );
        Integer y = Integer.valueOf(valor2);
        System.out.println("Valor digitado: " + y);
        
        if (x > y)
        {
            JOptionPane.showMessageDialog(null, x + " é maior que " + y);
            System.out.println(x + " é maior que " + y);                        
        }
        else if (x < y)
            {
            JOptionPane.showMessageDialog(null, x + " é menor que " + y);
            System.out.println(x + " é menor que " + y);            
            }
            else if (x == y)
                {
                JOptionPane.showMessageDialog(null, x + " é igual " + y);
                System.out.println(x + " é igual " + y);                
                }        
    }       
          
}
