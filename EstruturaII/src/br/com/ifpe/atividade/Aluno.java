package br.com.ifpe.atividade;

public class Aluno implements Comparable<Aluno>{
	String nome;
	String matricula;
	double mediaGlobal;

	public Aluno(String nome, String matricula, double mediaGlobal) {
		this.nome = nome;
		this.matricula = matricula;
		this.mediaGlobal = mediaGlobal;
	}

	@Override
	public int compareTo(Aluno o) {
		return Double.compare(this.mediaGlobal, 
			o.mediaGlobal);
		
	}
	
}
