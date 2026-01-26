package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int N = sc.nextInt();

        int[] numero = new int[N]; // cria o vetor

        // leitura dos números
        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            numero[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES:");

        // verificação dos pares
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                System.out.println(numero[i]);
            }
        }

        sc.close();
    }
}
