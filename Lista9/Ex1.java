package Lista9;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Informe o valor da posicao ("+(i+1)+","+(j+1)+")");
                matriz[i][j] = sc.nextInt();
            }
        }

        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j){
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println("A soma da diagonal principal é: "+soma);
    }
}
