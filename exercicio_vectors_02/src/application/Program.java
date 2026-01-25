package application;

import java.util.Scanner; // Importa a classe Scanner para ler dados do usuário

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        // Pergunta ao usuário quantos números ele quer digitar
        System.out.print("Quantos numeros voce vai digitar? ");
        int N = sc.nextInt(); // Lê o número inteiro N

        double[] vetor = new double[N]; // Cria um vetor de números reais (double) com tamanho N
        double soma = 0; // Inicializa a variável que irá armazenar a soma dos números

        // Laço para ler os N números e armazenar no vetor
        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble(); // Lê um número real e armazena no vetor
            soma += vetor[i]; // Soma o número lido à variável soma
        }

        // Imprime todos os elementos do vetor
        System.out.print("VALORES = ");
        for (int i = 0; i < N; i++) {
            System.out.print(vetor[i] + " "); // Imprime cada elemento seguido de espaço
        }
        System.out.println(); // Pula uma linha após imprimir todos os valores

        // Calcula a média
        double media = soma / N;

        // Imprime a soma e a média formatadas com duas casas decimais
        System.out.printf("SOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close(); // Fecha o Scanner
    }
}

//TESTANDO PUSH NO GIT