package br.com.tdstecnologia.eder;

import java.util.Random;

public class ArrayAleatorio60 {

    public static void main(String[] args) {
       
       int [] array = new int[10];
       Random random = new Random(100);
      
       
       for (int i = 0; i < array.length; i++){
         
           array [i] = random.nextInt(100);
           System.out.println(array[i]);
       }
       
    }

}
