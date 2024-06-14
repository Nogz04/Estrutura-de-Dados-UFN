package TrabalhoArvoreJAVA;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ArvoreMain {
    private static TreeSet<Atleta> atletas = new TreeSet<>(Comparator.comparingDouble(Atleta::getAltura));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMENU");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Listar por altura decrescente");
            System.out.println("4 - Remover");
            System.out.println("5 - Pesquisar por apelido");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            
            scanner.nextLine(); // Limpando o buffer para evitar erro
            
            switch (opcao) {
                case 1:
                    cadastrar(scanner);
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    listarPorAlturaDecrescente();
                    break;
                case 4:
                    remover(scanner);
                    break;
                case 5:
                    pesquisar(scanner);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void cadastrar(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Apelido: ");
        String apelido = scanner.nextLine();

        System.out.print("Altura: ");
        double altura = scanner.nextDouble();

        scanner.nextLine(); // Limpar o buffer

        System.out.print("Posição (entrada ou saída): ");
        String posicao = scanner.nextLine();

        Atleta atleta = new Atleta(nome, apelido, altura, posicao);
        atletas.add(atleta);
        System.out.println("Atleta cadastrado com sucesso!");
    }

    private static void listar() {
        System.out.println("\nListando atletas:");
        for (Atleta atleta : atletas) {
            System.out.println(atleta);
        }
    }

    private static void listarPorAlturaDecrescente() {
        System.out.println("\nListando atletas por altura decrescente:");
        TreeSet<Atleta> atletasDecrescente = new TreeSet<>(Comparator.comparingDouble(Atleta::getAltura).reversed());
        atletasDecrescente.addAll(atletas);
        for (Atleta atleta : atletasDecrescente) {
            System.out.println(atleta);
        }
    }

    private static void remover(Scanner scanner) {
        System.out.print("Apelido do atleta a ser removido: ");
        String apelido = scanner.nextLine();
        Atleta atletaRemover = null;
        for (Atleta atleta : atletas) {
            if (atleta.getApelido().equals(apelido)) {
                atletaRemover = atleta;
                break;
            }
        }
        if (atletaRemover != null) {
            atletas.remove(atletaRemover);
            System.out.println("Atleta removido com sucesso!");
        } else {
            System.out.println("Atleta não encontrado.");
        }
    }

    private static void pesquisar(Scanner scanner) {
        System.out.print("Apelido do atleta a ser pesquisado: ");
        String apelido = scanner.nextLine();
        for (Atleta atleta : atletas) {
            if (atleta.getApelido().equals(apelido)) {
                System.out.println("\nAtleta encontrado: " + atleta);
                return;
            }
        }
        System.out.println("\nAtleta não encontrado.");
    }
}
