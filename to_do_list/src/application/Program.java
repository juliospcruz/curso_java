package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluir() {
        this.concluida = true;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return (concluida ? "[X] " : "[ ] ") + descricao;
    }
}

public class Program {

    private static List<Tarefa> tarefas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa buffer

            switch (opcao) {
                case 1 -> adicionarTarefa();
                case 2 -> listarTarefas();
                case 3 -> concluirTarefa();
                case 4 -> removerTarefa();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n=== TO-DO LIST ===");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Concluir tarefa");
        System.out.println("4 - Remover tarefa");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarTarefa() {
        System.out.print("Descrição da tarefa: ");
        String descricao = scanner.nextLine();
        tarefas.add(new Tarefa(descricao));
        System.out.println("Tarefa adicionada!");
    }

    private static void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + " - " + tarefas.get(i));
        }
    }

    private static void concluirTarefa() {
        listarTarefas();
        if (tarefas.isEmpty()) return;

        System.out.print("Número da tarefa para concluir: ");
        int indice = scanner.nextInt() - 1;

        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).concluir();
            System.out.println("Tarefa concluída!");
        } else {
            System.out.println("Tarefa inválida!");
        }
    }

    private static void removerTarefa() {
        listarTarefas();
        if (tarefas.isEmpty()) return;

        System.out.print("Número da tarefa para remover: ");
        int indice = scanner.nextInt() - 1;

        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
            System.out.println("Tarefa removida!");
        } else {
            System.out.println("Tarefa inválida!");
        }
    }
}
