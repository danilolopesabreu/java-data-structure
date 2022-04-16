package merge_sort;

public class TestaOrdenacao_v2 {
	public static void main(String[] args) {
		
		final Aluno[] alunos = { new Aluno("A", 1), new Aluno("B", 5), new Aluno("C", 7), new Aluno("D", 9), new Aluno("D", 10), new Aluno("D", 12), new Aluno("D", 13), new Aluno("D", 14), new Aluno("A", 2), new Aluno("B", 3), new Aluno("C", 4), new Aluno("D", 6), new Aluno("D", 8), new Aluno("D", 11), new Aluno("D", 15) };
		
		final Aluno[] alunos2 = { new Aluno("A", 1), new Aluno("B", 3), new Aluno("C", 5), new Aluno("D", 0), new Aluno("D", 9), new Aluno("D", 2), new Aluno("D", 4), new Aluno("D", 6), new Aluno("D", 7), new Aluno("D", 8), new Aluno("D", 10)};
		
		final Aluno[] alunos3 = { new Aluno("A", 4), new Aluno("B", 5), new Aluno("C", 8), new Aluno("D", 9), new Aluno("D", 3), new Aluno("D", 6), new Aluno("D", 7), new Aluno("D", 10), new Aluno("D", 11)};
		
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
		
		Aluno[] alunosOrdenados = intercala(alunos4, 0, 1, 1);
		
		for (int i = 0; i < alunosOrdenados.length; i++) {
			System.out.println(alunosOrdenados[i]);
		}
		// 1 3 5 0 9 2 4 6 7 8 10
	}// 0 1 2 
	
	private static Aluno[] intercala(Aluno[] array, int inicio , int meio, int fim) {
		
		final Aluno[] alunosOrdenados = new Aluno[array.length];
		int meioDoArray = getPosicaoDoMeio(array.length);
		
		int posicaoDoMeio = meioDoArray;
		int posicaoInicio = 0;
		int atual = 0;
		
		while(posicaoInicio < meioDoArray) {
			
			if(array[posicaoInicio].getNota() < array[posicaoDoMeio].getNota()) {
				alunosOrdenados[atual] = array[posicaoInicio];
				atual++;
				posicaoInicio++;
			}else {
				alunosOrdenados[atual] = array[posicaoDoMeio];
				atual++;
				posicaoDoMeio++;
			}
		}
		
		addAll(alunosOrdenados, array, atual, posicaoDoMeio);
		
		return alunosOrdenados;
	}
	
	private static int getPosicaoDoMeio(int tamanhoArray) {
		return tamanhoArray / 2;
	}
	
	private static void addAll(Aluno[] target, Aluno[] source, int pointToFill, int pointToStartCopy) {
		for (int i = pointToFill; i <target.length; i++) {
			target[i] = source[pointToStartCopy];
			pointToStartCopy++;
		}
	}
}
