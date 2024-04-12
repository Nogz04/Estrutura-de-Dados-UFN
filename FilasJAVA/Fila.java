//Fila com String

import java.util.LinkedList;
import java.util.Queue;
//Estrutura de Dados
// - Fisicas: variáveis.
// - Abstratas: pilha (stack), lista(list), fila(queue).
// lista: add/append, remove, contains, sort -> ordenação e controle de duplicidade.
// fila (trabalhar com prioridade): add/append (final) e remove (inicio).

// FILA - FIFO (First in, First Out)

      //              Object

   //                  List

//          ArrayList Vector Stack Queue

public class Fila{

    public static void main(String[] args) {
        Queue<String> filaNomes = new LinkedList<String>(); //Queue = Filosofia, quem implementa é uma lista encadeada

        filaNomes.add("Saccol");
        filaNomes.add("Pinheiro");
        filaNomes.add("IAGO");

        System.out.println("Exibindo fila: ");
        System.out.println(filaNomes);

        System.out.println("Exibindo inicio: ");
        System.out.println(filaNomes.peek());

        System.out.println("Exibindo se a fila esta vazia: ");
        System.out.println(filaNomes.isEmpty());

        System.out.println("Exibindo o tamanho da fila: ");
        System.out.println(filaNomes.size());

        System.out.println("Verificando se o IAGO esta ou nao na fila: ");
        System.out.println(filaNomes.contains("IAGO"));

        //Método de remoção direto, sem for
        System.out.println("Removendo ... " +filaNomes.remove());
        System.out.println("Removendo ... " +filaNomes.remove());
        System.out.println("Removendo ... " +filaNomes.remove());
    }
}
