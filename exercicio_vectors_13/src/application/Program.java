package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            alturas[i] = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            generos[i] = sc.next().charAt(0);
        }

        double menor = alturas[0];
        double maior = alturas[0];

        double somaMulheres = 0.0;
        int contMulheres = 0;
        int contHomens = 0;

        for (int i = 0; i < n; i++) {

            if (alturas[i] < menor) {
                menor = alturas[i];
            }

            if (alturas[i] > maior) {
                maior = alturas[i];
            }

            if (generos[i] == 'F') {
                somaMulheres += alturas[i];
                contMulheres++;
            } else if (generos[i] == 'M') {
                contHomens++;
            }
        }

        double mediaMulheres = somaMulheres / contMulheres;

        System.out.printf("Menor altura = %.2f%n", menor);
        System.out.printf("Maior altura = %.2f%n", maior);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulheres);
        System.out.println("Numero de homens = " + contHomens);

        sc.close();
    }
}

