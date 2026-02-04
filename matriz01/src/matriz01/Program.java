package matriz01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] matriz = new int[M][N];

        // Leitura da matriz
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int X = sc.nextInt();

        // Percorre a matriz procurando X
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] == X) {
                    System.out.println("Posicao " + i + "," + j + ":");

                    // Esquerda
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }

                    // Acima
                    if (i > 0) {
                        System.out.println("Acima: " + matriz[i - 1][j]);
                    }

                    // Direita
                    if (j < N - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }

                    // Abaixo
                    if (i < M - 1) {
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
