package br.com.tdstecnologia.luciana;

import javax.swing.JOptionPane;
        
public class SomarNum32 {
    public static void main(String[] args){

        Integer valorInformadoPelousuario = 50;
        String valorInformadoPeloUsuario = JOptionPane.showInputDialog(null,"Digite um numero:");
        
        Integer contador = 0;
                
        for(int i= 0; i< valorInformadoPelousuario;i++) {
            contador = contador +i;
            }
            JOptionPane.showMessageDialog(null,"A soma dos numeros e:"+contador);
            }
        
      }