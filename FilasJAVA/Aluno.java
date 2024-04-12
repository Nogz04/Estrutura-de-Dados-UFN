public class Aluno{  //Orientado a Objeto a Fila2
    public int matricula;
    public String nome;

    public Aluno(int matricula, String nome){
        this.matricula =  matricula;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + "]";
    }


    @Override
    public boolean equals(Object obj) {
       
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula != other.matricula)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    
    
}
