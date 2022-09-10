package lista0909;
import java.io.*;
import java.util.Scanner;

class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de linhas desejadas");
        int n = sc.nextInt();

        for (int linha = 1; linha <= n; linha++) {
            int C = 1;
            for (int i = 1; i <= linha; i++) {
                System.out.print(C + " ");
                C = C * (linha - i) / i;
            }
            System.out.println();
        }
    }
}
