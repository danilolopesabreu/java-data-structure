package merge_sort;

public class TestaOrdenacao_v1 {
	public static void main(String[] args) {
		
		final Aluno[] alunos1 = { new Aluno("A", 1), new Aluno("B", 5), new Aluno("C", 7), new Aluno("D", 9), new Aluno("D", 10), new Aluno("D", 12), new Aluno("D", 13), new Aluno("D", 14), new Aluno("D", 16) };
		
		final Aluno[] alunos2 = { new Aluno("A", 2), new Aluno("B", 3), new Aluno("C", 4), new Aluno("D", 6), new Aluno("D", 8), new Aluno("D", 11), new Aluno("D", 15), new Aluno("D", 20), new Aluno("D", 23), new Aluno("D", 24) };
		
		Aluno[] alunosOrdenados = junta(alunos1, alunos2);
		
		for (int i = 0; i < alunosOrdenados.length; i++) {
			System.out.println(alunosOrdenados[i]);
		}
		
	}
	
	private static Aluno[] junta(Aluno[] array1, Aluno[] array2) {
		final Aluno[] alunosOrdenados = new Aluno[array1.length + array2.length];
		
		int indiceAlunos1 = 0;
		int indiceAlunos2 = 0;
		int i = 0;
		
		while(indiceAlunos1 < array1.length && indiceAlunos2 < array2.length) {
			
			if(array1[indiceAlunos1].getId() < array2[indiceAlunos2].getId()) {
				alunosOrdenados[i] = array1[indiceAlunos1];
				indiceAlunos1++;
			}else {
				alunosOrdenados[i] = array2[indiceAlunos2];
				indiceAlunos2++;
			}
			
			i++;
		}
		
		if(indiceAlunos2 == array2.length){
			addAll(alunosOrdenados, array1, i, indiceAlunos1);
		}else if(indiceAlunos1 == array1.length) {
			addAll(alunosOrdenados, array2, i, indiceAlunos2);
		}
		
		return alunosOrdenados;
	}
	
	private static void addAll(Aluno[] target, Aluno[] source, int pointToFill, int pointToStartCopy) {
		for (int i = pointToFill; i < target.length; i++) {
			target[i] = source[pointToStartCopy];
			pointToStartCopy++;
		}
	}
}
