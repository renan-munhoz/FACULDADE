/*
   Leia uma matriz 5 x 5. Leia também um valor X. O programa deverá fazer uma busca desse
valor na matriz e, ao final, escrever a localização (linha e coluna) ou uma mensagem de “não
encontrado”.
 */
package Facul.Lista8;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        int matrizValores[] = new int[25];
        int i, j, x;
        int coluna = 0, linha = 0;

        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                System.out.println("Insira o valor da Coluna = "+(i + 1)+" e da Linha = "+(j + 1));
                matriz[i][j] = in.nextInt();

                matrizValores[i] = matriz[i][j];
            }
        }

        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }

        System.out.println("Digite um número para buscar na matriz: ");
        x = in.nextInt();

        int ok = 0;

        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                if(x == matriz[i][j]) {
                    linha = i + 1;
                    coluna = j + 1;
                    ok = 1;
                }
            }
        }
        if(ok == 1) {
            System.out.println("O " +x+ " está localizado na coluna "+coluna+" e na linha "+linha);
        }else if (ok == 0){
            System.out.println("Valor não encontrado!");
        }
    }
}
