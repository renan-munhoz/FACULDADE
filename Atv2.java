/**
 * 2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
 * igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as
 * informações.
 */
package Facul.Lista3;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome, senha = "";

        do {
            System.out.println(" --- TELA LOGIN --- ");
            System.out.println("Digite seu nome: ");
            nome = in.nextLine();

            System.out.println("Digite sua senha: ");
            senha = in.nextLine();

            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("A senha não poder ser igual ao nome do usuário.");
                System.out.println("Digite novamente.");
                System.out.println();
            } else {
                break;
            }
        } while (nome != senha);
    }
}
