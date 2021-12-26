package Aula25ex3;

public class AlunoDaEscola {
	String nome;
	int matricula;
	String curso;
	boolean matriculado;
	String disciplina1;
	String disciplina2;
	String disciplina3;
	int nota1;
	int nota2;
	int nota3;
	
	int verificarAprovacao(){
		int aprovacao = (nota1 +nota2+nota3)/3;
		return aprovacao;
	}
}
