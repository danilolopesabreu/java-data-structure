package merge_sort;

import java.util.Iterator;

public class TestaOrdenacao_v3 {
	public static void main(String[] args) {
		
		final Aluno[] alunos4 = { new Aluno("A", 8), new Aluno("B", 5) };
		
		Aluno[] outrasAlunos = {
		        new Aluno("Jonas", 2),
		        new Aluno("Fernando", 2.3),
		        new Aluno("Ana", 7.1),
		        new Aluno("Guilherme", 8),
		        new Aluno("Alberto", 9.2),
		        new Aluno("Maria", 5.25),
		        new Aluno("Paulo", 6),
		        new Aluno("Enzo", 7.9),
		        new Aluno("Lucia", 9.8)
		};
		
		Aluno[] notas = {
		        new Aluno("Jonas", 4),
		        new Aluno("Fernando", 5),
		        new Aluno("Ana", 8.5),
		        new Aluno("Guilherme", 9),
		        new Aluno("Alberto", 3),
		        new Aluno("Maria", 6.7),
		        new Aluno("Paulo", 7),
		        new Aluno("Enzo", 9.3),
		        new Aluno("Lucia", 10)
		};
		
		intercala(notas, 0, 4, notas.length);
		 		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
	}
	
	private static void intercala(Aluno[] array, int inicio , int meio, int fim) {
		
		final Aluno[] arrayOrdenado = new Aluno[fim - inicio];
		
		int atual = 0;
		int atualInicio = inicio;
		int atualMeio = meio;
		
		while (atualInicio < meio &&
				atualMeio < fim) {
			
			Aluno aluno1 = array[atualInicio];
			Aluno aluno2 = array[atualMeio];
			
			if(aluno1.getNota() < aluno2.getNota()) {
				arrayOrdenado[atual] = aluno1;
				atualInicio++;
			}else {
				arrayOrdenado[atual] = aluno2;
				atualMeio++;
			}
			atual++;
		}
		
		while(atualInicio < meio) {
			arrayOrdenado[atual] = array[atualInicio];
			atualInicio++;
			atual++;
		}
		
		while(atualMeio < fim) {
			arrayOrdenado[atual] = array[atualMeio];
			atualMeio++;
			atual++;
		}
		
		for (int i = 0; i < atual; i++) {
			array[inicio + i] = arrayOrdenado[i];
		}
		
	}
	
}
