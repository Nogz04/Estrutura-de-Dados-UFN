package AV2Hash;

import java.util.*;
import java.io.*;

//FIZ PELO INTELIJ, lá, se clicar com o botão direito sobre o arquivo.csv dentro da IDE,
//terá como exportar o arquivo até para BD, não testei em outra IDE.
//No meu caso, ao salvar o programa em meu PC em SAVE ALL, ele criou o arquivo.csv executavel em Excel automaticamente.

class Atleta {
    private String fone;
    private String nome;
    private String apelido;
    private String dataNascimento;
    private int pontuacaoAcumulada;

    public Atleta(String fone, String nome, String apelido, String dataNascimento, int pontuacaoAcumulada) {
        this.fone = fone;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.pontuacaoAcumulada = pontuacaoAcumulada;
    }

    // Getters e Setters
    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getPontuacaoAcumulada() {
        return pontuacaoAcumulada;
    }

    public void setPontuacaoAcumulada(int pontuacaoAcumulada) {
        this.pontuacaoAcumulada = pontuacaoAcumulada;
    }

    // Métodos auxiliares
    @Override
    public String toString() {
        return "Atleta{" +
                "fone='" + fone + '\'' +
                ", nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", pontuacaoAcumulada=" + pontuacaoAcumulada +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atleta atleta = (Atleta) o;
        return Objects.equals(fone, atleta.fone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fone);
    }
}

class GerenciadorAtletas {
    private List<Atleta> atletas;

    public GerenciadorAtletas() {
        this.atletas = new ArrayList<>();
    }

    // Métodos para manipulação de atletas
    public void listarAtletas() {
        if (atletas.isEmpty()) {
            System.out.println("Não há atletas cadastrados.");
        } else {
            atletas.forEach(System.out::println);
        }
    }

    public void cadastrarAtleta(Atleta atleta) {
        if (!atletas.contains(atleta)) {
            atletas.add(atleta);
            System.out.println("Atleta cadastrado com sucesso.");
        } else {
            System.out.println("Atleta já cadastrado.");
        }
    }

    public void procurarAtleta(String chave) {
        for (Atleta atleta : atletas) {
            if (atleta.getNome().equalsIgnoreCase(chave) || atleta.getApelido().equalsIgnoreCase(chave)) {
                System.out.println("Atleta encontrado: " + atleta);
                return;
            }
        }
        System.out.println("Atleta não encontrado.");
    }

    public void removerAtleta(String chave) {
        Iterator<Atleta> iterator = atletas.iterator();
        while (iterator.hasNext()) {
            Atleta atleta = iterator.next();
            if (atleta.getNome().equalsIgnoreCase(chave) || atleta.getApelido().equalsIgnoreCase(chave)) {
                iterator.remove();
                System.out.println("Atleta removido com sucesso.");
                return;
            }
        }
        System.out.println("Atleta não encontrado.");
    }

    // Salvar em arquivo CSV
    public void salvarEmCSV(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Atleta atleta : atletas) {
                writer.println(atleta.getFone() + ";" +
                        atleta.getNome() + ";" +
                        atleta.getApelido() + ";" +
                        atleta.getDataNascimento() + ";" +
                        atleta.getPontuacaoAcumulada());
            }
            System.out.println("Dados salvos em " + filename); //Será salvo em um arquivo, ao compilar e
                                                               // preencher os dados novamente, irá sobreescrever o arquivo.
                                                                //(Irá salvar apenas quando apertar o 5 para salvar no menu, e o 6 em seguida para SAIR)
        } catch (IOException e) {
            System.out.println("Erro ao salvar em arquivo.");
            e.printStackTrace();
        }
    }
}


