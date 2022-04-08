import java.util.ArrayList;

/**
 * Adicionar itens
 * Recuperar item a partir de um indice
 * Adicionar ao fim do array
 * Adicionar no meio do array
 * Remover item
 * 
 * @see java.util.ArrayList
 * */
public class ArmazenamentoSequencial {

	private char array[] = new char[10];
	private int qtdElementos = 0;
	
	/**
	 * Conhecendo a proxima posicao disponivel a insercao de elementos sera mais rapida.
	 * Se for usado um loop para descobrir a proxima posicao disponivel o algoritmo sera mais lento.
	 * */
	public void addItemArray(char value) {
		
		this.grow();
		
		this.array[qtdElementos] = value;
		
		if(qtdElementos < this.array.length)
			qtdElementos++;
	}
	
	private void grow() {
		if(qtdElementos == array.length - 1) {
			char[] array = new char[qtdElementos*2];
			for (int i = 0; i < this.array.length; i++) {
				array[i] = this.array[i];
			}
			this.array = array;
		}
	}
	
	public char getItem(int index) {
		return this.array[index];
	}
	
	/**
	 * Sera necessario reorganizar o vetor para insercao de elementos de maneira arbitraria no meio do array
	 * */
	public void addByIndex(char value, int index) {
		this.grow();
		
		char localValue = value;
		char aux;
		for (int i = index; i <= this.qtdElementos; i++) {
			aux = this.array[i];
			this.array[i] = localValue;
			localValue = aux;
		}
		this.qtdElementos++;
	}
	
	public void removeItem(int index) {
		for (int i = index; i < this.qtdElementos-1; i++) {
			this.array[i] = this.array[i+1]; 
		}
		this.array[this.qtdElementos-1] = ' ';
		this.qtdElementos--;
	}
	
	public void imprimirArray() {
		System.out.println(this.array);
	}
}
