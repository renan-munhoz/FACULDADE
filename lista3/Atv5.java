/**
 * 5. Altere o programa anterior permitindo ao usuário informar as populações e as taxas
 * de crescimento iniciais. Valide a entrada e permita repetir a operação.
 */
package Facul.Lista3;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int popA;
        int popB;
        int cont = 0;
        double taxaA, taxaB;

        System.out.print("Informe a quantidade de pessoas na população A: ");
        popA = in.nextInt();
        System.out.print("Digite a taxa de crescimento da população A: ");
        taxaA = in.nextDouble();

        System.out.print("Informe a quantidade de pessoas na população B: ");
        popB = in.nextInt();
        System.out.print("Digite a taxa de crescimento da população B: ");
        taxaB = in.nextDouble();

        while (popB > popA) {
            popA += popA * 1 + taxaA/100;
            popB += popB * 1 + taxaB/100;
            cont++;
        }

        System.out.println("Demorara "+cont+" anos");
    }
}