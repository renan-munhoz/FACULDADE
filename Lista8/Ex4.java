/*
   Leia uma matriz 4 x 4, imprima a matriz e retorne à localização (linha e a coluna) do maior
valor.
 */
package Facul.Lista8;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int i, j;
        int coluna = 0, linha = 0;
        int maiorValor = 0;

        for(i = 0; i < 4; i++) {
            for(j = 0; j < 4 ; j++) {
                System.out.println("Coluna = "+(i + 1)+" Linha = "+(j + 1));
                matriz[i][j] = in.nextInt();

                if(matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    coluna = i + 1;
                    linha = j + 1;
                }
            }
        }

        for(i = 0; i < 4; i++) {
            for(j = 0; j < 4; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
        System.out.println("Maior valor na Coluna = "+coluna+" e Linha = "+linha);
    }
}