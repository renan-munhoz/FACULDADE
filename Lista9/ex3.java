package Lista9;

import java.util.Arrays;
import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        int[][] cartela = new int[5][5];
        int[] auxCartela = new int[25];
        Random rn = new Random();
        int c = 0;

        for (int i = 0; i < 25; i++){
            auxCartela[i] = 100;
        }

        while(contem(auxCartela,100)){
            int num = rn.nextInt(100);

            if (!contem(auxCartela, num)){
                auxCartela[c] = num;
                c++;
            }
        }


        System.out.println();
        int k = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                cartela[i][j] = auxCartela[k];
                k++;
            }
        }

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(cartela[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean contem(int[] vetor, int num) {
        return Arrays.stream(vetor).anyMatch(i -> i == num);
    }
}
