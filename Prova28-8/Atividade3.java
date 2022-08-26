import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a massa original do material radioativo");
        float massaInicial = sc.nextFloat();
        float massaFinal;
        int segundos = 0, minutos = 0, horas = 0;

        float massa = massaInicial;

        while (massa > 0.5){
                massa /= 2;
                segundos += 50;
        }

        massaFinal = massa;

        while (segundos >= 60){
            segundos -= 60;
            minutos++;
        }

        while (minutos >= 60){
            minutos -= 60;
            horas++;
        }

        System.out.println("Massa inicial: "+massaInicial);
        System.out.println("Massa final: "+massaFinal);
        System.out.println("Horas: "+horas+" Minutos: "+minutos+" Segundos: "+segundos);


    }
}
