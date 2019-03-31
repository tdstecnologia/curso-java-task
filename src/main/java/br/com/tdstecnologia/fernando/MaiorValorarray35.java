package br.com.tdstecnologia.fernando;

import java.util.Scanner;

public class MaiorValorarray35 {

    public static void main(String[] args) {
        int[] array = new int[5];
        int maior = 0;

        for (int contador = 0; contador < array.length; contador++) {

            Scanner scaner = new Scanner(System.in);
            System.out.println("Informe os Números da Array:");
            array[contador] = scaner.nextInt();
        }

        for (int contador = 0; contador < array.length; contador++) {

            if (array[contador] > maior) {
                maior = array[contador];
            }
        }
        System.out.println("Maior Valor da Array : " + maior);
    }

}
