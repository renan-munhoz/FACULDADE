/**
 * 9. Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
 */
package Facul.Lista3;

public class Atv9 {
    public static void main(String[] args) {
        int n1;

        for(n1 = 1; n1 <= 50; n1++) {
            if(n1 % 2 == 1) {
                System.out.println("Ímpares: "+n1);
            }
        }
    }
}
