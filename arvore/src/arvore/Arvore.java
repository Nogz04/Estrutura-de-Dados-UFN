package arvore;

import javax.swing.*;
import java.util.TreeSet;

public class Arvore {
    public static void main(String[] args) {

        TreeSet<Aluno> arvore = new TreeSet<>();
//        arvore.add(new Aluno(20, "Yuri"));
//        arvore.add(new Aluno(10, "Angela"));
//        arvore.add(new Aluno(1, "Alex"));
//        arvore.add(new Aluno(5, "Antony"));
//        arvore.add(new Aluno(5, "Antony"));
//        arvore.add(new Aluno(4, "Pinheiro"));

        int matricula;
        String nome;
        Aluno aluno;

        for (int i = 0; i < 10; i++) {
            matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe matricula:"));
            nome = JOptionPane.showInputDialog(null, "Informe nome:");
            aluno = new Aluno(matricula, nome);
            arvore.add(aluno);
        }

        for (Aluno item : arvore) {
            System.out.println(item);
        }

    }
}
