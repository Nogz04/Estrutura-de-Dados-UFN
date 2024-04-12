import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;




public class Fila2{

    public static void main(String[] args) {
        Queue<Aluno> filaAlunos = new LinkedList<Aluno>(); //Queue = Filosofia, quem implementa é uma lista encadeada

        Scanner teclado =  new Scanner(System.in);

        filaAlunos.add(new Aluno(1, "Saccol"));
        filaAlunos.add(new Aluno(7, "Pinheiro"));
        filaAlunos.add(new Aluno(2, "Iago"));


        int matricula;
        String nome;

        for(int i = 0; i < 2; i++){
            System.out.println("Matricula: ");
            matricula = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Nome: ");
            nome = teclado.nextLine();
            filaAlunos.add(new Aluno(matricula, nome));

        }


        System.out.println("Exibindo fila: ");
        System.out.println(filaAlunos);

        System.out.println("Exibindo inicio: ");
        System.out.println(filaAlunos.peek());

        System.out.println("Exibindo se a fila esta vazia: ");
        System.out.println(filaAlunos.isEmpty());

        System.out.println("Exibindo o tamanho da fila: ");
        System.out.println(filaAlunos.size());

        System.out.println("Verificando se 2 e Iago está na fila: ");
        Aluno a =  new Aluno(2, "Iago");
        System.out.println(filaAlunos.contains(a));

        // System.out.println("Verificando se o IAGO esta ou nao na fila: ");
        // System.out.println(filaAlunos.contains("Iago"));

        //outro método
        while (!filaAlunos.isEmpty()){
         System.out.println("Removendo ... " +filaAlunos.poll());
         
         try {
            Thread.sleep(3000);
         }
         catch(Exception e){
            System.out.println(e.getMessage());
         }
        }

        System.out.println("Removendo ... " +filaAlunos.poll());

        
        
       
    }
}
