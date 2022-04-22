package binary_search;

import merge_sort.Aluno;
import quick_sort.QuickSort;

public class BuscaBinaria {
	public static void main(String[] args) {
		
		Aluno[] notas = { new Aluno("Enzo", 5.6), new Aluno("Jonas", 4), new Aluno("Fernando", 5),
				new Aluno("Ana", 8.5), new Aluno("Enzo", 9.1), new Aluno("Guilherme", 9), new Aluno("Alberto", 3),
				new Aluno("Enzo", 8.3), new Aluno("Maria", 2), new Aluno("Paulo", 7.3), new Aluno("Enzo", 9.3),
				new Aluno("Lucia", 10), new Aluno("Pivo", 7) };

		QuickSort.ordena(notas, 0, notas.length);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		double encontrarNota = 50;
		int elemento = buscar(notas, 0, notas.length, encontrarNota);
		
		if(elemento >= 0)
			System.out.println("\n Achou: "+notas[elemento]);
		else
			System.out.println("Não achou elemento "+encontrarNota);
	}

	private static int buscar(Aluno[] notas, int de, int ate, double nota) {
		int metade = de + ((ate - de) / 2);
		if(metade <= ate-1 && de != metade) {
			if(notas[metade].getNota() < nota) {
				return buscar(notas, metade, ate, nota);
			}
			if(notas[metade].getNota() > nota) {
				return buscar(notas, de, metade, nota);
			}
			if(notas[metade].getNota() == nota) {
				return metade;
			}
		}
		if(metade == de) {
			if(notas[metade].getNota() == nota) {
				return metade;
			}
		}
		return -1;
	}
}
