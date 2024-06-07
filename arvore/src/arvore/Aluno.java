package arvore;

import java.util.Objects;

class Aluno implements Comparable<Aluno> {
    int matricula;
    String nome;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, nome);
    }

    @Override
    public int compareTo(Aluno o) {
        if(this.matricula < o.matricula) {
            return -1;
        }else if(this.matricula > o.matricula) {
            return 1;
        }
        return 0;
    }
}
