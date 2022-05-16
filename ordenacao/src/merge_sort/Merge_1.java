package merge_sort;

/**
 * Merge sort
 * 1 - encontrar o 'base case': 
 * 		Dividir o array em 'sub-arrays', � uma divis�o l�gica, s�o referencias posicionais baseada no array de entrada.
 * 			Primeiro o sub-array da esquerda (do inicio at� o meio do array) � dividido at� o tamanho de 1. (base case)
 * 			� realizada a tentativa de dividir o array da direita (do meio at� o fim), porem, como a chamada na pilha de execu��o est� no base case
 * 			  a execu��o � retornada para a stack-frame anterior.
 * 			Por fim � realizado o 'merge'.
 * 			No merge � realizado a ordena��o dos elementos, o m�todo vai comparar os elementos do inicio e meio (esquerda/direita).
 * 			  A condi��o de saida ser� o atingimento do inicio at� o meio ou do meio ao fim do array.
 * 			  Um novo array � criado para armazenar o resultado das compara��es.
 * 			  � necessario realizar a c�pia dos elementos restantes quando algum dos sub-arrays seja finalizado (inicio/meio/fim). 
 *		 	  Por fim, os elementos do intervalo inicio, meio e fim do array ordenado � copiado para a referencia do array principal.	
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
