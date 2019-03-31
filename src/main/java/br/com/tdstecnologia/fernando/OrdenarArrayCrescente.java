package br.com.tdstecnologia.fernando;

import java.util.Scanner;

public class OrdenarArrayCrescente {

    public static void main(String[] args) {
        int[] array = new int[5];
        int auxiliar = 0;

        for (int i = 0; i < array.length; i++) {

            Scanner scaner = new Scanner(System.in);
            System.out.println("Informe os Números da Array:");
            array[i] = scaner.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {

                    auxiliar = array[i];

                    array[i] = array[j];

                    array[j] = auxiliar;

                }

            }
        }

        for (int i = 0; i < array.length; i++) {

            System.out.println("Ordenação Crescente:" + array[i]);

        }

    }

}
