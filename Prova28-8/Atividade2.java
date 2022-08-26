public class Atividade2 {
    public static void main(String[] args) {
        double salario = 1000.00;
        double aumento = 0.015;

        for (int i = 1; i <= 26; i++){
            salario *=  1+aumento;
            aumento *= 2;
        }

        System.out.println("O salario atual deste funcionario e de: "+salario);
    }
}
