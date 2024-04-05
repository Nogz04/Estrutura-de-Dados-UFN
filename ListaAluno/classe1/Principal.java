package classe1;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
	
		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		
		
		String nome = "Matheus";
		int idade = 19;
		String curso = "CC";
		Aluno obj = new Aluno(nome,idade,curso);
		listaAlunos.add(obj);
		
		listaAlunos.add(new Aluno("Lucas", 18, "CC"));
		
		
		System.out.println(listaAlunos);
	}

}
