package application;

import java.util.Scanner; // Importa a classe Scanner para ler dados do usuário

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        // Pergunta ao usuário quantos números ele quer digitar
        System.out.print("Quantas pessoas serao digitadas? ");
        int N = sc.nextInt(); // Lê o número inteiro N
        
        // Vetores para armazenar os dados
        String[] nomes = new String[N];
        int[] idades = new int[N];
        double[] alturas = new double[N];

        double somaAlturas = 0.0; // Para somar as alturas

        // Leitura dos dados
        for (int i = 0; i < N; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");

            System.out.print("Nome: ");
            sc.nextLine(); // Limpa o buffer
            nomes[i] = sc.nextLine(); // Lê o nome

            System.out.print("Idade: ");
            idades[i] = sc.nextInt(); // Lê a idade

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble(); // Lê a altura

            somaAlturas += alturas[i]; // Soma as alturas
        }

        // Calcula a média das alturas
        double media = somaAlturas / N;

        // Conta quantas pessoas têm menos de 16 anos
        int contMenores = 0;
        for (int i = 0; i < N; i++) {
            if (idades[i] < 16) {
                contMenores++;
            }
        }

        // Calcula a porcentagem
        double porcentagem = ((double) contMenores / N) * 100.0;

        // Mostra os resultados
        System.out.printf("\nAltura média: %.2f\n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);

        // Mostra os nomes das pessoas com menos de 16 anos
        for (int i = 0; i < N; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close(); // Fecha o Scanner
    }
        
        
}
