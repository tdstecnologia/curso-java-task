/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tdstecnologia.samira;

import java.util.Random;

/**
 *
 * @author Aluno1
 */
public class PreencherArrayNumAleat58 {

    /*Crie um array com 10 posições e preencha com números aleatórios até 100 
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        Random gerador=new Random();

        for (int i = 0; i < array.length; i++) {
            array [i] = gerador.nextInt(100);
        }
        for (int i = 0;i < array.length; i++) {
        System.out.println(array [i]);
        
        }     
       
*//this code is ok! (´;`)
    }
}
