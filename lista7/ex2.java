package lista0909;

public class ex2 {
    public static void main(String[] args) {
        int[] vet = new int[100];
        int i = 1, j = 0;
        vet[99] = 0;

        while (vet[99] == 0){
            String teste = String.valueOf(i);
            if (i%7 != 0 && !teste.endsWith("7")){
                vet[j] = i;
                j++;
            }
            i++;
        }

        for (int c = 0; c < 100; c++){
            System.out.println(vet[c]);
        }
    }
}
