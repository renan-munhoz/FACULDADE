/**
 * 7. Faça um programa que leia 5 números e informe o maior número.
 */
package Facul.Lista3;

import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, num;
        int mNum = 0;

        for(n1 = 1; n1 <= 5; n1++) {
            System.out.println("Digite o "+n1+"° número: ");
            num = in.nextInt();

            if(num > mNum) {
                mNum = num;
            }
        }
        System.out.println("O maior número digitado foi "+mNum);
    }
}
