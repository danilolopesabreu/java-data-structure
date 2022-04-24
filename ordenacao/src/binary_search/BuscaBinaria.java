package binary_search;

import merge_sort.Aluno;
import quick_sort.QuickSort;

public class BuscaBinaria {
	public static void main(String[] args) {
		
		Aluno[] notas = { new Aluno("Enzo", 5.6), new Aluno("Jonas", 4), new Aluno("Jose", 0), new Aluno("Fernando", 5),
				new Aluno("Ana", 8.5), new Aluno("Enzo", 9.1), new Aluno("Guilherme", 9), new Aluno("Alberto", 3),
				new Aluno("Enzo", 8.3), new Aluno("Maria", 2), new Aluno("Paulo", 7.3), new Aluno("Enzo", 9.3),
				new Aluno("Lucia", 10), new Aluno("Pivo", 7), new Aluno("Pivo", 12) };

		QuickSort.ordena(notas, 0, notas.length);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		testaBuscaBinaria(notas, -15);
		testaBuscaBinaria(notas, -5);
		testaBuscaBinaria(notas, 0);
		testaBuscaBinaria(notas, 1);
		testaBuscaBinaria(notas, 2);
		testaBuscaBinaria(notas, 5);
		testaBuscaBinaria(notas, 9.1);
		testaBuscaBinaria(notas, 10);
		testaBuscaBinaria(notas, 12);
		testaBuscaBinaria(notas, 15);
		testaBuscaBinaria(notas, 20);
		
	}
	
	private static void testaBuscaBinaria(Aluno[] notas, double valorBuscado) {
		double encontrarNota = valorBuscado;
		int elemento = buscar(notas, 0, notas.length, encontrarNota);
		
		if(elemento >= 0)
			System.out.println("\n Achou: "+notas[elemento]);
		else
			System.out.println("Não achou elemento "+encontrarNota);
	}

	private static int buscar(Aluno[] notas, int de, int ate, double buscando) {
		System.out.println("buscando "+buscando+" de "+de+" ate "+ate);
		if(de > ate || de == notas.length) {
			return -1;
		}
		int meio = (de + ate) / 2;
		Aluno nota = notas[meio];
		if(buscando == nota.getNota()) {
			return meio;
		}
		if(buscando < nota.getNota()) {
			return buscar(notas, de, meio - 1, buscando);
		}
		return buscar(notas, meio+1, ate, buscando);
	}
}
