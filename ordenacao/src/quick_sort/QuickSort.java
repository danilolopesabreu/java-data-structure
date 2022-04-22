package quick_sort;

import merge_sort.Aluno;

public class QuickSort {
	public static void main(String[] args) {
		Aluno[] notas = { new Aluno("Enzo", 5.6), new Aluno("Jonas", 4), new Aluno("Fernando", 5),
				new Aluno("Ana", 8.5), new Aluno("Enzo", 9.1), new Aluno("Guilherme", 9), new Aluno("Alberto", 3),
				new Aluno("Enzo", 8.3), new Aluno("Maria", 2), new Aluno("Paulo", 7.3), new Aluno("Enzo", 9.3),
				new Aluno("Lucia", 10), new Aluno("Pivo", 7) };
		
		ordena(notas, 0, notas.length);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}
	
	private static void ordena(Aluno[] notas, int inicio, int termino) {
		int qtdElementos = termino - inicio;
		if(qtdElementos > 1) {
			int posicaoPivo = particiona(notas, inicio, termino);
			ordena(notas, inicio, posicaoPivo);
			ordena(notas, posicaoPivo+1, termino);
		}
	}

	private static void troca(Aluno[] alunos, int de, int para) {
		Aluno origem = alunos[de];
		Aluno destino = alunos[para];
		alunos[de] = destino;
		alunos[para] = origem;
	}

	private static int particiona(Aluno[] notas, int inicial, int termino) {
		int menoresEncontrados = 0;
		for(int analisando = 0; analisando < termino-1; analisando++) {
			if(notas[analisando].getNota() <= notas[termino-1].getNota()) {
				troca(notas, analisando, menoresEncontrados);
				menoresEncontrados++;
			}
		}
		troca(notas, menoresEncontrados, termino-1);
		return menoresEncontrados;
	}
}
