/**
 * 8. Faça um programa que leia 5 números e informe a soma e a média dos números.
 */
package Facul.Lista3;

import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num[] = new float[5];
        float soma = 0;

        for (int i = 1; i < 6; i++){
            System.out.println("Informe o "+i+" numero");
            num[i-1] = sc.nextInt();
            soma += num[i-1];
        }

        soma = soma/5;
        System.out.println("A media das notas foi de "+soma);
    }
}