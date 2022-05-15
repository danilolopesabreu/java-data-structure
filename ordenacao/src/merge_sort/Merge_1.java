package merge_sort;

public class Merge_1 {
	
	public static void main(String args[]) {
		int [] array = {38, 27, 43, 3, 9, 82, 10, 1, 2, 50, 52, 55};
		sort(array, 0, array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static void merge(int[] array, int inicio, int meio, int fim) {
		int[] arrayOrdenado = new int[fim - inicio];
		
		int atual = 0;
		int atualInicio = inicio;
		int atualMeio = meio;
		
		while(atualInicio < meio && atualMeio < fim){
			
			int elementoInicio  = array[atualInicio];
			int elementoMeio = array[atualMeio];
			
			if(elementoInicio < elementoMeio) {
				arrayOrdenado[atual] = elementoInicio;
				atualInicio++;
			} else {
				arrayOrdenado[atual] = elementoMeio;
				atualMeio++;
			}
			
			atual++;
		}
		
		while(atualInicio < meio){
			arrayOrdenado[atual] = array[atualInicio];
			atualInicio++;
			atual++;
		}
		
		while(atualMeio < fim){
			arrayOrdenado[atual] = array[atualMeio];
			atualMeio++;
			atual++;
		}
		
		for (int i = 0; i < atual; i++) {
			array[inicio + i] = arrayOrdenado[i];
		}
	}
	
	private static void sort(int[] array, int inicio, int fim) {
		int qtd = fim - inicio;
		if(qtd > 1) {
			int meio = (fim + inicio) / 2;
			sort(array, inicio, meio);
			sort(array, meio, fim);
			merge(array, inicio, meio, fim);
		}
	}
	
}
