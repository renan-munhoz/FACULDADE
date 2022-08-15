/**
*3. Faça um programa que leia e valide as seguintes informações:
 * a. Nome: maior que 3 caracteres;
 * b. Idade: entre 0 e 150;
 * c. Salário: maior que zero;
 * d. Sexo: 'f' ou 'm';
 * e. Estado Civil: 's', 'c', 'v', 'd';
 */
package Facul.Lista3;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome, sexo, estCivil = "";
        int salario, idade;

        do {
            System.out.print("Digite seu nome: ");
            nome = in.nextLine();
            if(nome.length() <= 3) {
                System.out.println("O nome tem que ter mais que 3 caracteres.");
            }
        } while(nome.length() <= 3);
        System.out.println();

        do {
            System.out.print("Digite sua idade: ");
            idade = in.nextInt();
            if ((idade < 0) && (idade > 150)) {
                System.out.println("Idade invalida.");
            }
        } while (idade >= 0 && idade > 150);
        System.out.println();

        do {
            System.out.print("Digite seu salário: ");
            salario = in.nextInt();
            if (salario <= 0) {
                System.out.println("Salário inválido.");
                System.out.println("Tem que ser maio que zero.");
            }
        } while(salario <= 1);
        System.out.println();

        System.out.println("Informe seu sexo, se for masculino digite 'm' se for feminino digite 'f': ");
        sexo = in.next();
        System.out.println();

        System.out.println("Qual seu estado civil? ");
        System.out.println("Para solteiro digite 'f'");
        System.out.println("Para casado digite 'c'");
        System.out.println("Para viúvo digite 'v'");
        System.out.println("Para divorciado digite 'd'");
        System.out.print("Digite: ");
        estCivil = in.next();

        in.close();
    }
}

