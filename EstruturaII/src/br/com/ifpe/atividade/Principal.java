package br.com.ifpe.atividade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("joao", "20222ADS-PM0091", 7);
		Aluno aluno2 = new Aluno("Maria", "20222ADS-PM0092", 8);
		Aluno aluno3 = new Aluno("Pedro", "20222ADS-PM0093", 9.5);
		Aluno aluno4 = new Aluno("Ana", "20222ADS-PM0094", 6);
		Aluno aluno5 = new Aluno("Lucas", "20222ADS-PM0095", 2);
		Aluno aluno6 = new Aluno("Mariana", "20222ADS-PM0096", 7);
		Aluno aluno7 = new Aluno("Carlos", "20222ADS-PM0097", 5);
		Aluno aluno8 = new Aluno("Julia", "20222ADS-PM0098", 9.5);
		Aluno aluno9 = new Aluno("Eduardo", "20222ADS-PM0099", 10);
		Aluno aluno10 = new Aluno("Sophia", "20222ADS-PM0100", 8);

		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		alunos.add(aluno5);
		alunos.add(aluno6);
		alunos.add(aluno7);
		alunos.add(aluno8);
		alunos.add(aluno9);
		alunos.add(aluno10);

		Collections.sort(alunos, Collections.reverseOrder());

		double guarda = 0;
		double maiorNota = alunos.get(0).mediaGlobal;
		double menorNota = alunos.get(9).mediaGlobal;

		for (Aluno alunu : alunos) {
			guarda += alunu.mediaGlobal / 10;
			// 5-A
			// System.out.print(alunu.nome + " ");

			if (alunu.mediaGlobal >= 7.0) {
				// 5-B
				// System.out.println(alunu.nome + " " + alunu.mediaGlobal);
			}

			if (alunu.mediaGlobal > 9) {
				// 5-C
				// System.out.println(alunu.nome + " " + alunu.mediaGlobal);
			}

			if (alunu.mediaGlobal == maiorNota) {
				// 5-E

				// System.out.println("Maior nota da turma foi de "+ maiorNota);
				// System.out.println(alunu.nome);
			}
			if (alunu.mediaGlobal == menorNota) {
				// 5-F

				// System.out.println("Menor nota da turma foi "+ menorNota);
				// System.out.println(alunu.nome);
			}
		} // 5-D
			// System.out.println("Média geral da turma é " + guarda);

		// 5-G
		List<String> maioresQaMedia = new ArrayList<String>();
		for (Aluno alunu : alunos) {
			if (alunu.mediaGlobal >= guarda) {
				maioresQaMedia.add(alunu.nome);
				// System.out.println("maior que media da sala " + alunu.nome + ' ' +
				// alunu.mediaGlobal);
			}

		}
		for (String aluno : maioresQaMedia) {
			// System.out.println("Tem "+ aluno);

		}
	}

}