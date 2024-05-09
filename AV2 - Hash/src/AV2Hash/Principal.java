package AV2Hash;

import java.util.Scanner;

//FIZ PELO INTELIJ, lá, se clicar com o botão direito sobre o arquivo.csv dentro da IDE,
//terá como exportar o arquivo até para BD, não testei em outra IDE.
//No meu caso, ao salvar o programa em meu PC em SAVE ALL, ele criou o arquivo.csv executavel em Excel automaticamente.

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorAtletas gerenciador = new GerenciadorAtletas();

        while (true) {
            System.out.println("\nMenu\n" +
                    "1 - Listar atletas (nome ou por pontuação decrescente)\n" +
                    "2 - Cadastrar atleta\n" +
                    "3 - Procurar por atleta (nome ou apelido)\n" +
                    "4 - Remover atleta (nome ou apelido)\n" +
                    "5 - Salvar em arquivo CSV\n" +
                    "6 - Sair\n" +
                    "Opção:");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    gerenciador.listarAtletas();
                    break;
                case 2:
                    System.out.println("Digite o telefone:");
                    String fone = scanner.nextLine();
                    System.out.println("Digite o nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o apelido:");
                    String apelido = scanner.nextLine();
                    System.out.println("Digite a data de nascimento:");
                    String dataNascimento = scanner.nextLine();
                    System.out.println("Digite a pontuação acumulada:");
                    int pontuacaoAcumulada = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    Atleta novoAtleta = new Atleta(fone, nome, apelido, dataNascimento, pontuacaoAcumulada);
                    gerenciador.cadastrarAtleta(novoAtleta);
                    break;
                case 3:
                    System.out.println("Digite o nome ou apelido do atleta:");
                    String chaveProcura = scanner.nextLine();
                    gerenciador.procurarAtleta(chaveProcura);
                    break;
                case 4:
                    System.out.println("Digite o nome ou apelido do atleta a ser removido:");
                    String chaveRemocao = scanner.nextLine();
                    gerenciador.removerAtleta(chaveRemocao);
                    break;
                case 5:
                    gerenciador.salvarEmCSV("atletas.csv"); //Será salvo em um arquivo, ao compilar e
                    break;                                          //preencher os dados novamente, irá sobreescrever o arquivo.
                                                                    //(Irá salvar apenas quando apertar o 5 para salvar no menu, e o 6 em seguida para SAIR)
                case 6:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}


