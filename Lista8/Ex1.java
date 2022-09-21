/*
   Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.
 */
package Facul.Lista8;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int cont = 0;
        int coluna, linha;

        for(linha = 0; linha < 4; linha++) {
            for(coluna = 0; coluna < 4; coluna++) {
                System.out.println("Linha = "+(linha + 1)+" Coluna = "+(coluna + 1));
                matriz[linha][coluna] = in.nextInt();
            }
        }
        for(linha = 0; linha < 4; linha++) {
            for(coluna = 0; coluna < 4; coluna++) {
                if(matriz[linha][coluna] > 10) {
                    cont++;
                }
            }
        }
        System.out.println("Existem "+cont+" números maiores que 10.");
    }
}
