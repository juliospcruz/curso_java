package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura da ordem da matriz
        int N = sc.nextInt();

        int[][] matriz = new int[N][N];
        int negativos = 0;

        // Leitura da matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] < 0) {
                    negativos++;
                }
            }
        }

        // Exibição da diagonal principal
        System.out.println("Diagonal principal:");
        for (int i = 0; i < N; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        // Exibição da quantidade de números negativos
        System.out.println();
        System.out.println("Quantidade de valores negativos = " + negativos);

        sc.close();
    }
}
