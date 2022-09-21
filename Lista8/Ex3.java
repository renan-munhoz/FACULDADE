/*
   Faça um programa que preenche uma matriz 4 x 4 com o produto do valor da linha e da coluna
de cada elemento. Em seguida, imprima na tela a matriz.
 */
package Facul.Lista8;

public class Ex3 {
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int i, j;

        for(i = 0; i < 4; i++) {
            for(j = 0; j < 4; j++) {
                matriz[i][j] = i * j;
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
    }
}
