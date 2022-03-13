package com.br.revisao;

/*
 Faça um programa que leia 5 números e informe o maior número.
 */

public class Main {
    public static void main(String[] args) {
        int maior = 0;
        for ( int i = 1 ; i <=5 ; i++ ) {
            System.out.print(i + " ");
            if ( i > maior ) maior = i;
        }
        System.out.println("\nmaior número é: " + maior);

    }
}
