/**
 * 11.Altere o programa anterior para mostrar no final a soma dos números.
 */
package Facul.Lista3;

import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int soma;

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
        System.out.println("A soma entre o 1° e o 2° número é: "+(soma = num1 + num2));
    }
}
