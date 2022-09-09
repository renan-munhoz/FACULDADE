import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            System.out.println("Informe um valor a ser adicionado");
            int num = sc.nextInt();
            numeros.add(num);
        }

        int maior = 0, menor = 0;

        for (int i = 0; i < 5; i++) {
            if (i == 0){
                maior = numeros.get(i);
                menor = numeros.get(i);
            }

            if (maior < numeros.get(i)){
                maior = numeros.get(i);
            }

            if (menor > numeros.get(i)){
                menor = numeros.get(i);
            }
        }

        System.out.println("O maior numero é:"+maior);
        System.out.println("O menor numero é:"+menor);
    }
}
