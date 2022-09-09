public class Atividade2 {
    public static void main(String[] args) {
        double[] salario = new double[27];
        salario[0] = 1000;
        double aumento = 0.015;

        for (int i = 0; i < 26; i++){
            salario[i] *=  1+aumento;
            aumento *= 2;
            salario[i+1] = salario[i];
            System.out.println("salario em 1996: "+ salario[i]);
        }


    }
}
