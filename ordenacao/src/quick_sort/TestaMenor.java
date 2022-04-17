package quick_sort;

import merge_sort.Aluno;

public class TestaMenor {
	public static void main(String[] args) {
		Aluno[] notas = { new Aluno("Enzo", 6.6), new Aluno("Jonas", 4), new Aluno("Fernando", 5),
				new Aluno("Ana", 8.5), new Aluno("Enzo", 9.1), new Aluno("Guilherme", 9), new Aluno("Alberto", 3),
				new Aluno("Enzo", 8.3), new Aluno("Maria", 6.7), new Aluno("Paulo", 7), new Aluno("Enzo", 9.3),
				new Aluno("Lucia", 10) };
		
		int qtdMenores = encontrarMenor(notas, new Aluno("Enzo", 7));
		
		System.out.println(qtdMenores);
	}

	private static int encontrarMenor(Aluno[] notas, Aluno referencia) {
		int qtdMenor = 0;
		for(Aluno nota : notas) {
			if(nota.getNota() < referencia.getNota())
				qtdMenor++;
		}
		return qtdMenor;
	}
}
