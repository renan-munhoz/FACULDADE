/**
 * 4. Supondo que a população de um país A seja da ordem de 80000 habitantes com
 * uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes
 * com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o
 * número de anos necessários para que a população do país A ultrapasse ou iguale a
 * população do país B, mantidas as taxas de crescimento.
 */
package Facul.Lista3;

public class Atv4 {
    public static void main(String[] args) {
        int popA = 80000;
        int popB = 200000;
        int cont = 0;

        while (popB > popA){
            popA += popA * 1.03;
            popB += popB * 1.015;
            cont++;
        }

        System.out.println("Demorara "+cont+" anos");
    }
}
