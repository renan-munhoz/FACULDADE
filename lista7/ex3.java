package lista0909;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];

        for (int i = 0; i < 6; i++){
            System.out.println("Informe o valor ");
            vet[i] = sc.nextInt();
        }

        System.out.println("Numeros pares");
        for (int i = 0; i < 6; i++){
            if (vet[i] % 2 == 0){
                System.out.println(vet[i]);
            }
        }

        System.out.println("Soma dos numeros pares");
        for (int i = 0; i < 6; i++){
            if (vet[i] % 2 == 0){
                int soma = 0;
                soma += vet[i];
                System.out.println(soma);
            }
        }

        System.out.println("Numeros impares");
        int c = 0;
        for (int i = 0; i < 6; i++){
            if (vet[i] % 2 == 1){
                System.out.println(vet[i]);
                c++;
            }
        }

        System.out.println("quantidade de numeros impares");
        System.out.println(c);
    }
}
