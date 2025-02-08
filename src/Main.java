import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== TO-DO LIST ====");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Listar Tarefas por Prioridade");
            System.out.println("4. Listar Tarefas por Categoria");
            System.out.println("5. Listar Tarefas por Status");
            System.out.println("6. Atualizar Status Tarefa");
            System.out.println("7. Consultar quantidade de Tarefas por Status");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Data de término (YYYY-MM-DD): ");
                    LocalDate dataTermino = LocalDate.parse(scanner.nextLine());
                    System.out.print("Prioridade (1-5): ");
                    int prioridade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Status (todo/doing/done): ");
                    String status = scanner.nextLine();

                    Tarefa novaTarefa = new Tarefa(nome, descricao, dataTermino, prioridade, categoria, status);
                    gerenciador.adicionarTarefa(novaTarefa);
                    System.out.println("Tarefa adicionada!");
                    break;

                case 2:
                    System.out.print("Nome da tarefa a remover: ");
                    String nomeRemover = scanner.nextLine();
                    gerenciador.removerTarefa(nomeRemover);
                    System.out.println("Tarefa removida!");
                    break;

                case 3:
                    System.out.println("\n📋 Lista de Tarefas por Prioridade:");
                    gerenciador.listarPorPrioridade();
                    break;

                case 4:
                    System.out.println("\n📋 Lista de Tarefas por Categoria:");
                    String category = scanner.nextLine();
                    gerenciador.listarPorCategoria(category);
                    break;

                case 5:
                    System.out.println("\n📋 Lista de Tarefas por Status:");
                    String stats = scanner.nextLine();
                    gerenciador.listarPorStatus(stats);
                    break;

                case 6:
                    System.out.print("Nome da tarefa: ");
                    String nomeAtualizar= scanner.nextLine();
                    System.out.print("Novo Status (todo/doing/done): ");
                    String statusAtualizar= scanner.nextLine();
                    gerenciador.atualizarTarefa(nomeAtualizar, statusAtualizar);
                    System.out.println("Tarefa atualizada!");
                    break;

                case 7:
                    gerenciador.consultar();
                    break;

                case 8:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
