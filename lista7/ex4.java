package lista0909;

import java.util.ArrayList;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        ArrayList<Integer> vet3 = new ArrayList<>();


        for (int i = 0; i < 10; i++){
            System.out.println("Informe  o valor do vetor 1 na posicao "+i);
            vet1[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++){
            System.out.println("Informe  o valor do vetor 2 na posicao "+i);
            vet2[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++){
            int cont = 0;
            for (int j = 0; j < 10; j++){
                if (vet1[i] == vet2[j]){
                    cont++;
                }
            }
            if (cont == 0){
                vet3.add(vet1[i]);
            }
        }

        for (int i = 0; i < 10; i++){
            int cont = 0;
            for (int j = 0; j < 10; j++){
                if (vet2[i] == vet1[j]){
                    cont++;
                }
            }
            if (cont == 0){
                vet3.add(vet2[i]);
            }
        }

        for (int i = 0; i < vet3.size(); i++){
            System.out.println(vet3.get(i));
        }
    }
}
