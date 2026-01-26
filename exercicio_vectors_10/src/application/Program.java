package application;

import java.util.Scanner;

public class Program  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int maisVelha = idades[0];
        int posicao = 0;

        for (int i = 1; i < n; i++) {
            if (idades[i] > maisVelha) {
                maisVelha = idades[i];
                posicao = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomes[posicao]);

        sc.close();
    }
}
