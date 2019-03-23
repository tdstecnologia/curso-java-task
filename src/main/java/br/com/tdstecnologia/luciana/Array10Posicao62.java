package br.com.tdstecnologia.luciana;

import java.util.Random;

public class Array10Posicao62 {

    public static void main(String[] args) {
        int[] array = new int[10];

        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }

    }
}
