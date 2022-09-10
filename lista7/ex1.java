package lista0909;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Informe  o valor do vetor A na posicao "+i);
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++){
            System.out.println("Informe  o valor do vetor B na posicao "+i);
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++){
            c[i] = a[i] - (b[i] * a[i]);
            System.out.println("Resultado na posicao "+i+": "+c[i]);
        }
    }
}
