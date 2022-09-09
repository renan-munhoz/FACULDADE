import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a massa original do material radioativo");
        float massaInicial = sc.nextFloat();
        float massaFinal;
        int[] tempo = new int[3];


        float massa = massaInicial;

        while (massa > 0.5){
                massa /= 2;
                tempo[3] += 50;
        }

        massaFinal = massa;
        tempo[2] = 0;

        while (tempo[3] >= 60){
            segundos -= 60;
            tempo[2]++;
        }
        tempo[1] = 0;

        while (minutos >= 60){
            minutos -= 60;
            tempo[0]++;
        }

        System.out.println("Massa inicial: "+massaInicial);
        System.out.println("Massa final: "+massaFinal);
        System.out.println("Horas: "+tempo[0]+" Minutos: "+tempo[1]+" Segundos: "+tempo[2]);


    }
}
