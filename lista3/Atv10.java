/**
 * 10.Faça um programa que receba dois números inteiros e gere os números inteiros
 * que estão no intervalo compreendido por eles.
 */
package Facul.Lista3;

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Informe o 1 numero");
        int num1 = sc.nextInt();

        System.out.println("Informe o 2 numero");
        int num2 = sc.nextInt();

        if (num1 < num2){
            for (int i = num1+1; i < num2; i++){
                System.out.println(i);
            }
        }else if (num1 > num2){
            for (int i = num2+1; i < num1; i++){
                System.out.println(i);
            }
        }
    }
}
