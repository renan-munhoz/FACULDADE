/*
   Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais elementos.
Escreva ao final a matriz obtida.
 */
package Facul.Lista8;

public class Ex2 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int coluna, linha;

        for(linha = 0; linha < 5; linha++) {
            for(coluna = 0; coluna < 5; coluna++) {
                if(linha == coluna) {
                    matriz[linha][coluna] = 1;
                } else {
                    matriz[linha][coluna] = 0;
                }
            }
        }

        for(linha = 0; linha < 5; linha++) {
            for(coluna = 0; coluna < 5; coluna++) {
                System.out.print("["+matriz[linha][coluna]+"]");
            }
            System.out.println();
        }
    }
}
