package merge_sort;

public class MergeSort {
	public static void main(String[] args) {
		
		final Aluno[] alunos4 = { new Aluno("A", 8), new Aluno("B", 5) };
		
		Aluno[] outrosAlunos = {
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
				new Aluno("Enzo", 6.6),
		        new Aluno("Jonas", 4),
		        new Aluno("Fernando", 5),
		        new Aluno("Ana", 8.5),
		        new Aluno("Enzo", 9.1),
		        new Aluno("Guilherme", 9),
		        new Aluno("Alberto", 3),
		        new Aluno("Enzo", 8.3),
		        new Aluno("Maria", 6.7),
		        new Aluno("Paulo", 7),
		        new Aluno("Enzo", 9.3),
		        new Aluno("Lucia", 10)
		};
		
		Aluno[] arrayCopia = notas;  
		
		ordena(arrayCopia, 0, arrayCopia.length);
		
//		intercala(arrayCopia, 0, 1, 2);
//		intercala(arrayCopia, 2, 3, 4);
//		intercala(arrayCopia, 0, 2, 4);
//
//		intercala(arrayCopia, 4, 5, 6);
//		intercala(arrayCopia, 6, 7, 8);
//		intercala(arrayCopia, 4, 6, 8);
//
//		intercala(arrayCopia, 0, 4, 8);
//
//		intercala(arrayCopia, 0, 8, 9);
		 		
		for (int i = 0; i < arrayCopia.length; i++) {
			System.out.println(arrayCopia[i]);
		}
		
	}
	
	private static void ordena(Aluno[] notas, int inicio, int termino) {

		  int quantidade = termino - inicio;
		  if(quantidade > 1) {
		    int meio = (inicio + termino) / 2;
		    ordena(notas, inicio, meio);
		    ordena(notas, meio, termino);
		    intercala(notas, inicio, meio, termino);
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
		
		//sobreescreve os valores originais com os valores ordenados.
		for (int i = 0; i < atual; i++) {
			array[inicio + i] = arrayOrdenado[i];
		}
		
	}
	
}
