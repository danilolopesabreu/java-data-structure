package merge_sort;

/**
 * Merge sort
 * 1 - encontrar o 'base case': 
 * 		Dividir o array em 'sub-arrays', é uma divisão lógica, são referencias posicionais baseada no array de entrada.
 * 			Primeiro o sub-array da esquerda (do inicio até o meio do array) é dividido até o tamanho de 1. (base case)
 * 			É realizada a tentativa de dividir o array da direita (do meio até o fim), porem, como a chamada na pilha de execução está no base case
 * 			  a execução é retornada para a stack-frame anterior.
 * 			Por fim é realizado o 'merge'.
 * 			No merge é realizado a ordenação dos elementos, o método vai comparar os elementos do inicio e meio (esquerda/direita).
 * 			  A condição de saida será o atingimento do inicio até o meio ou do meio ao fim do array.
 * 			  Um novo array é criado para armazenar o resultado das comparações.
 * 			  É necessario realizar a cópia dos elementos restantes quando algum dos sub-arrays seja finalizado (inicio/meio/fim). 
 *		 	  Por fim, os elementos do intervalo inicio, meio e fim do array ordenado é copiado para a referencia do array principal.	
 * */
public class Merge_1 {
	
	public static void main(String args[]) {
		int [] array = {38, 27, 43, 3, 9, 82, 10};
		sort(array, 0, array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static void sort(int[] array, int inicio, int fim) {
		int qtdElementos = fim - inicio;
		if(qtdElementos > 1) {
			int meio = (inicio + fim) / 2;
			sort(array, inicio, meio);
			sort(array, meio, fim);
			merge(array, inicio, meio, fim);
		}
	}

	private static void merge(int[] array, int inicio, int meio, int fim) {
		int [] arrayOrdenado = new int[fim - inicio];
		int atual = 0;
		int atualInicio = inicio;
		int atualMeio = meio;
		
		while(atualInicio < meio && atualMeio < fim) {
			int elementoAtual = array[atualInicio];
			int elementoMeio = array[atualMeio];
			
			if(elementoAtual < elementoMeio) {
				arrayOrdenado[atual] = elementoAtual;
				atualInicio++;
			} else {
				arrayOrdenado[atual] = elementoMeio;
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
