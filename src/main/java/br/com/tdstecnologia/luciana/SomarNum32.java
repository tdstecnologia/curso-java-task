package br.com.tdstecnologia.luciana;

import java.util.Scanner;
public class SomarNum32 {
    public static void main(String[] args){
              System.out.println("Informe um número: ");
        int num = new Scanner(System.in).nextInt();
        int soma = 0;
     

        while(num>0) {
           
            soma += (num % 10);
            
            num /= 10;//num = num / 10;
            System.out.println("O valor de soma é: " + soma);
        }
        System.out.println();
        System.out.println("A soma dos algarismos é: " + soma);

    }
}