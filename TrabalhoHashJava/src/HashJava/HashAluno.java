package HashJava;

import java.util.HashSet;


public class HashAluno {
    public static void main(String[] args){
        HashSet<Aluno> hashAluno = new HashSet<>();


        System.out.println("\nMATRÍCULA & NOME: ");
        System.out.println();
        hashAluno.add(new Aluno(1, "Matheus"));
        hashAluno.add(new Aluno(2, "Zamberlan"));
        hashAluno.add(new Aluno(3, "Romeo"));

        for(Aluno item : hashAluno){
            System.out.println(item);
        }

        Aluno obj1 = new Aluno(1, "Matheus");
        Aluno obj2= new Aluno(2, "Zamberlan");
        Aluno obj3 = new Aluno(3, "Romeo");

        System.out.println();

        System.out.println("VERIFICAÇÃO: ");

        if(hashAluno.contains(obj1)){
            System.out.println("\nNome 1 Encontrado.");
        } else {
            System.out.println("Nome 1 NÃO encontrado.");
        }

        if(hashAluno.contains(obj2)){
            System.out.println("Nome 2 Encontrado.");
        } else {
            System.out.println("Nome 2 NÃO encontrado.");
        }

        if(hashAluno.contains(obj3)){
            System.out.println("Nome 3 Encontrado.");
        } else {
            System.out.println("Nome 3 NÃO encontrado.");
        }


    }
}