package Lista9;

import java.util.Scanner;

public class Ex2 {public static void main(String[] args) {
    int[][] matriz = new int[3][3];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 3; i++){
        for (int j = 0; j < 3; j++){
            System.out.println("Informe o valor da posicao ("+(i+1)+","+(j+1)+")");
            matriz[i][j] = sc.nextInt();
        }
    }

    int soma = matriz[1][0] + matriz[2][1];

    System.out.println("A soma da diagonal a baixo da principal é: "+soma);
}
}
