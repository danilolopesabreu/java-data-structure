package merge_sort;

public class TestaOrdenacao {
	public static void main(String[] args) {
		
		final Aluno[] alunos1 = { new Aluno("A", 1), new Aluno("B", 5), new Aluno("C", 7), new Aluno("D", 9), new Aluno("D", 10), new Aluno("D", 12), new Aluno("D", 13), new Aluno("D", 14) };
		
		final Aluno[] alunos2 = { new Aluno("A", 2), new Aluno("B", 3), new Aluno("C", 4), new Aluno("D", 6), new Aluno("D", 8), new Aluno("D", 11), new Aluno("D", 15) };
		
		final Aluno[] alunosOrdenados = new Aluno[alunos1.length + alunos2.length];
		
		int indiceAlunos1 = 0;
		int indiceAlunos2 = 0;
		
		for (int i = 0; i < alunosOrdenados.length; i++) {
			
			if(indiceAlunos2 == alunos2.length){
				addAll(alunosOrdenados, alunos1, i, indiceAlunos1);
				break;
			}else if(indiceAlunos1 == alunos1.length) {
				addAll(alunosOrdenados, alunos2, i, indiceAlunos2);
				break;
			}
			
			if(alunos1[indiceAlunos1].getId() < alunos2[indiceAlunos2].getId()) {
				alunosOrdenados[i] = alunos1[indiceAlunos1];
				indiceAlunos1++;
			}else {
				alunosOrdenados[i] = alunos2[indiceAlunos2];
				indiceAlunos2++;
			}
		}
		
		for (int i = 0; i < alunosOrdenados.length; i++) {
			System.out.println(alunosOrdenados[i]);
		}
		
	}
	
	private static void addAll(Aluno[] target, Aluno[] source, int pointToFill, int pointToStartCopy) {
		for (int i = pointToFill; i < target.length; i++) {
			target[pointToFill] = source[pointToStartCopy];
		}
	}
}
