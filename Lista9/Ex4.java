package Lista9;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][4];
        LerMatriz(matriz);
        CalcularNota(matriz);
        MostrarMatriz(matriz);
        MaiorNota(matriz);
        MediaDeNotas(matriz);
    }

    public static void LerMatriz (int[][] matriz){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++){
                if (j == 0){
                    System.out.println("Informe a matricula");
                    matriz[i][j] = sc.nextInt();
                } else if (j == 1){
                    System.out.println("Informe a media da prova");
                    matriz[i][j] = sc.nextInt();
                } else if (j == 2){
                    System.out.println("Informe a media dos trabalhos");
                    matriz[i][j] = sc.nextInt();
                }
            }
        }
    }

    public static void MostrarMatriz (int[][] matriz){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void CalcularNota (int[][] matriz){
        for (int i = 0; i < 5; i++) {
            matriz[i][3] = matriz[i][2] + matriz[i][1];
        }
    }

    public static void MaiorNota (int[][] matriz){
        int maior = 0;
        int posicao = 0;
        for (int i = 0; i < 5; i++) {
            if (maior < matriz[i][3]){
                maior = matriz[i][3];
                posicao = i;
            }
        }

        System.out.println("A maior media foi a do aluno: "+matriz[posicao][0]);
    }

    public static void MediaDeNotas (int[][] matriz){
        double media = 0;
        for (int i = 0; i < 5; i++){
            media += matriz[i][3];
        }
        media /= 5;

        System.out.println("A media da turma foi de: "+media);
    }
}
